package com.icei.domain;

public class AssessLikeRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assess_like_relation.assess_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    private Integer assessId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assess_like_relation.user_Id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assess_like_relation.assess_id
     *
     * @return the value of assess_like_relation.assess_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public Integer getAssessId() {
        return assessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assess_like_relation.assess_id
     *
     * @param assessId the value for assess_like_relation.assess_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAssessId(Integer assessId) {
        this.assessId = assessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assess_like_relation.user_Id
     *
     * @return the value of assess_like_relation.user_Id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assess_like_relation.user_Id
     *
     * @param userId the value for assess_like_relation.user_Id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}