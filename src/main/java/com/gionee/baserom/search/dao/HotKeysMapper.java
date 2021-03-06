package com.gionee.baserom.search.dao;

import com.gionee.baserom.search.pojo.HotKeys;
import com.gionee.baserom.search.pojo.HotKeysExample;
import com.gionee.baserom.search.pojo.HotkeySource;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface HotKeysMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int countByExample(HotKeysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int deleteByExample(HotKeysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int insert(HotKeys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int insertSelective(HotKeys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	List<HotKeys> selectByExample(HotKeysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	HotKeys selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") HotKeys record, @Param("example") HotKeysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") HotKeys record, @Param("example") HotKeysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(HotKeys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hot_keys
	 * @mbggenerated
	 */
	int updateByPrimaryKey(HotKeys record);

	/*********************
     * 以下为手动加入的方法
     *********************/
    
    HotkeySource getUseredSource();

    List<HotKeys> getAllHotKeys();
    
    void deleteAll();

	List<HotKeys> queryByPage(Map<String, Object> map);
}