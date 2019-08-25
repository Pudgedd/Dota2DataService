package com.kendall.dota2dataservice.dao;

import com.kendall.dota2dataservice.pojo.model.Skill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    int insert(Skill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    Skill selectByPrimaryKey(Integer id);

    List<Skill> selectByHeroId(Integer heroId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    List<Skill> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Skill record);

    void batchInsert(@Param("skills") List<Skill> skills);
}