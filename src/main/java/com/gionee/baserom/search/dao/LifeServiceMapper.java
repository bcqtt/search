package com.gionee.baserom.search.dao;

import com.gionee.baserom.search.pojo.Card;
import com.gionee.baserom.search.pojo.LifeService;
import com.gionee.baserom.search.pojo.LifeServiceExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LifeServiceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int countByExample(LifeServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int deleteByExample(LifeServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int insert(LifeService record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int insertSelective(LifeService record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	List<LifeService> selectByExample(LifeServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	LifeService selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") LifeService record, @Param("example") LifeServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") LifeService record, @Param("example") LifeServiceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(LifeService record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table life_service
	 * @mbggenerated
	 */
	int updateByPrimaryKey(LifeService record);
	
	/*********************
     * 以下为手动加入的方法
     *********************/

	/**
     * 查询分页信息
     * @param map
     * @return
     */
	List<LifeService> queryByPage(Map<String, Object> map);

}