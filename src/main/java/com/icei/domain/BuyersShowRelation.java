package com.icei.domain;

public class BuyersShowRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buyers_show_relation.brand_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column buyers_show_relation.assess_img_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    private Integer assessImgId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buyers_show_relation.brand_id
     *
     * @return the value of buyers_show_relation.brand_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buyers_show_relation.brand_id
     *
     * @param brandId the value for buyers_show_relation.brand_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column buyers_show_relation.assess_img_id
     *
     * @return the value of buyers_show_relation.assess_img_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public Integer getAssessImgId() {
        return assessImgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column buyers_show_relation.assess_img_id
     *
     * @param assessImgId the value for buyers_show_relation.assess_img_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAssessImgId(Integer assessImgId) {
        this.assessImgId = assessImgId;
    }
}