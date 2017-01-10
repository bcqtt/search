package com.gionee.baserom.search.dao;

import com.gionee.baserom.search.pojo.AdClassify;
import com.gionee.baserom.search.pojo.AdClassifyExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdClassifyMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int countByExample(AdClassifyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int deleteByExample(AdClassifyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int insert(AdClassify record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int insertSelective(AdClassify record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	List<AdClassify> selectByExample(AdClassifyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	AdClassify selectByPrimaryKey(Integer cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") AdClassify record, @Param("example") AdClassifyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") AdClassify record, @Param("example") AdClassifyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(AdClassify record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_classify
	 * @mbggenerated
	 */
	int updateByPrimaryKey(AdClassify record);

	/**
     * 查询分页信息
     * @param map
     * @return
     */
	List<AdClassify> queryByPage(Map<String, Object> map);

	List<AdClassify> getAllClassify();
}