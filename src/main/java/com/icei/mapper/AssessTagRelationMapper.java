package com.icei.mapper;

import com.icei.domain.AssessTagRelation;

public interface AssessTagRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess_tag_relation
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int deleteByPrimaryKey(Integer assessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess_tag_relation
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int insert(AssessTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess_tag_relation
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int insertSelective(AssessTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess_tag_relation
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    AssessTagRelation selectByPrimaryKey(Integer assessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess_tag_relation
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int updateByPrimaryKeySelective(AssessTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess_tag_relation
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    int updateByPrimaryKey(AssessTagRelation record);
}