package com.gionee.baserom.search.dao;

import com.gionee.baserom.search.pojo.Rosters;
import com.gionee.baserom.search.pojo.RostersExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RostersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int countByExample(RostersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int deleteByExample(RostersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int insert(Rosters record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int insertSelective(Rosters record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    List<Rosters> selectByExample(RostersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    Rosters selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Rosters record, @Param("example") RostersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Rosters record, @Param("example") RostersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Rosters record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rosters
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Rosters record);
    
    /*********************
     * 以下为手动加入的方法
     *********************/
    
    List<Rosters> queryByPage(Map<String, Object> map);
}