package com.icei.mapper;

import com.icei.domain.EcommendAward;

public interface EcommendAwardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecommend_award
     *
     * @mbg.generated Sun May 20 11:21:13 CST 2018
     */
    int deleteByPrimaryKey(Integer awardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecommend_award
     *
     * @mbg.generated Sun May 20 11:21:13 CST 2018
     */
    int insert(EcommendAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecommend_award
     *
     * @mbg.generated Sun May 20 11:21:13 CST 2018
     */
    int insertSelective(EcommendAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecommend_award
     *
     * @mbg.generated Sun May 20 11:21:13 CST 2018
     */
    EcommendAward selectByPrimaryKey(Integer awardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecommend_award
     *
     * @mbg.generated Sun May 20 11:21:13 CST 2018
     */
    int updateByPrimaryKeySelective(EcommendAward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecommend_award
     *
     * @mbg.generated Sun May 20 11:21:13 CST 2018
     */
    int updateByPrimaryKey(EcommendAward record);
}