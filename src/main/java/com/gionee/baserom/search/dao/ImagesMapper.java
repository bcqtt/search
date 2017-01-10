package com.gionee.baserom.search.dao;

import com.gionee.baserom.search.pojo.Images;
import com.gionee.baserom.search.pojo.ImagesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ImagesMapper {
    
    
    /*********************
     * 以下为手动加入的方法
     *********************/

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int countByExample(ImagesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int deleteByExample(ImagesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int insert(Images record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int insertSelective(Images record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	List<Images> selectByExample(ImagesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	Images selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Images record, @Param("example") ImagesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Images record, @Param("example") ImagesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Images record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table images
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Images record);

	/**
     * 查询分页信息
     * @param map
     * @return
     */
	List<Images> queryByPage(Map<String, Object> map);

	void updateRef(@Param("isRef")int isRef, @Param("fileName")String fileName);
}