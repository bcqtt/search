package com.gionee.baserom.search.job.impl.baidu;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gionee.baserom.search.dao.HotKeysMapper;
import com.gionee.baserom.search.job.IDataExtract;
import com.gionee.baserom.search.pojo.HotKeys;
import com.gionee.baserom.search.util.HttpUtil;

@Service("baiduDataExtract")
public class BaiduDataExtract implements IDataExtract {
    private final Logger logger = LoggerFactory.getLogger(BaiduDataExtract.class);
    private static final String EXCHANGE_RATE_URL = "http://top.baidu.com/gen_json?b=1";

    @Resource
    private HotKeysMapper hotKeysMapper;

    @Override
    public void execute() {
        logger.info(this.getClass().getName() + "---->execute");
 
        String httpRateString = HttpUtil.sendGet(EXCHANGE_RATE_URL, "utf-8");
        logger.info("百度热词(JSON)----->" + httpRateString);
        BaiduDataResult result = JSON.parseObject(httpRateString, BaiduDataResult.class);
        httpRateString = JSON.toJSONString(result);
        if (result != null) {
            Map<String,BaiduDataBean> mapData = result.getData();
            if (mapData != null) {
            	hotKeysMapper.deleteAll();
            	for (Map.Entry<String,BaiduDataBean> entry : mapData.entrySet()) {  
            		BaiduDataBean dataBean = entry.getValue();
                    HotKeys hotKeys = new HotKeys();
                    hotKeys.setHotKey(dataBean.word);
                    hotKeys.setSortId(Integer.parseInt(entry.getKey()));
                    logger.info("(百度)getHotKeys -----> " + dataBean.word);
                    hotKeysMapper.insert(hotKeys);
            	} 
            }
        }
    }
    
    public static void main(String[] args) {
    	BaiduDataExtract extract = new BaiduDataExtract();
    	extract.execute();
	}
}