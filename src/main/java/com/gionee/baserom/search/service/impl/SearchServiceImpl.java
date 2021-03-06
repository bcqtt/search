package com.gionee.baserom.search.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gionee.baserom.search.dao.HotkeySourceMapper;
import com.gionee.baserom.search.pojo.HotkeySource;
import com.gionee.baserom.search.service.ISearchService; 

@Service("searchService")
public class SearchServiceImpl implements ISearchService {
    private final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);
 
    @Resource
    private HotkeySourceMapper hotkeySourceMapper; 
 
    @Override
    public String getUseredSourceCode() {
        return hotkeySourceMapper.getUseredSource().getSourceCode();
    } 

    @Override
    public List<HotkeySource> getAllDataSource(int type) {
        return hotkeySourceMapper.getAllDataSource(type);
    }

    @Override
    public HotkeySource getUseredSource() {
        return hotkeySourceMapper.getUseredSource();
    }

    @Override
    public void updateUseSource(String sourceCode,int type) {
    	hotkeySourceMapper.cleanUseredFlag(type);
    	hotkeySourceMapper.setUseredFlag(sourceCode,type);
    }
 
    @Override
    public Map<String, Object> getStatus() {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
	public String getHotkeySourceUrl() {
		return hotkeySourceMapper.getHotkeySourceUrl();
	}

	@Override
	public List<HotkeySource> getAllAssoSource() {
		return hotkeySourceMapper.getAllAssoSource();
	}
 
}
