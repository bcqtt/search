package com.gionee.baserom.search.dao;

import com.gionee.baserom.search.pojo.AdDisplayRule;
import com.gionee.baserom.search.pojo.AdDisplayRuleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdDisplayRuleMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int countByExample(AdDisplayRuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int deleteByExample(AdDisplayRuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int insert(AdDisplayRule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int insertSelective(AdDisplayRule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	List<AdDisplayRule> selectByExample(AdDisplayRuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	AdDisplayRule selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") AdDisplayRule record, @Param("example") AdDisplayRuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") AdDisplayRule record, @Param("example") AdDisplayRuleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(AdDisplayRule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_display_rule
	 * @mbggenerated
	 */
	int updateByPrimaryKey(AdDisplayRule record);

	/**
     * 查询分页信息
     * @param map
     * @return
     */
	List<AdDisplayRule> queryByPage(Map<String, Object> map);

	/**
	 * 查询全部
	 * @return
	 */
	List<AdDisplayRule> queryAllAdRule();
}