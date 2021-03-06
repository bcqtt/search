package com.gionee.baserom.search.common;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.gionee.baserom.search.service.ISearchService;
import com.gionee.baserom.search.util.ApplicationHelper;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

/**
 * AOP扩展
 * @author laizhiwen
 */
@Aspect  
@Component 
public class AopExtend {
	private final Logger logger = LoggerFactory.getLogger(AopExtend.class);
	
	@Before("execution(public void com.gionee.baserom.search.job.impl.*.*DataExtract.execute(..))")  
	public void beforeMethod() {
		// TODO 预留的AOP扩展
		logger.info("定时任务执行前切入要做的事情！");
	}
	
	/**
	 * 切换采集源源之后更新缓存
	 */
	@AfterReturning("execution(public void com.gionee.baserom.search.service.impl.SearchServiceImpl.updateUseSource(..))")
	public void afterChangeSource() {
		String hotkey_source_url = updateCache();
		logger.info("----->切换采集源，更新采集源缓存为:" + hotkey_source_url);
	}
	
	/**
	 * 保存采集源后更新缓存
	 */
	@AfterReturning("execution(public * com.gionee.baserom.search.service.impl.HotkeySourceServiceImpl.saveHotkeySource(..))")
	public void afterSaveSource() {
		String hotkey_source_url = updateCache();
		logger.info("----->添加(修改)采集源，更新采集源缓存为:" + hotkey_source_url);
	}
	
	/**
	 * 更新采集源缓存
	 * @return
	 */
	private String updateCache(){
		ISearchService searchService = (ISearchService) ApplicationHelper.getApplicationContext().getBean("searchService");
		String hotkey_source_url = searchService.getHotkeySourceUrl();
		Cache cache = EHCacheManager.initCacheManager().getCache("sourceUrlCache");
		cache.removeAll();
		Element element = new Element("cache_hotkey_source_url", hotkey_source_url);
		cache.put(element);
		
		return hotkey_source_url;
	}
	
	
}
