package com.icei.domain;

public class PowerRoleAuth {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_role_auth.authority_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    private Integer authorityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column power_role_auth.role_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    private Integer roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_role_auth.authority_id
     *
     * @return the value of power_role_auth.authority_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_role_auth.authority_id
     *
     * @param authorityId the value for power_role_auth.authority_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column power_role_auth.role_id
     *
     * @return the value of power_role_auth.role_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column power_role_auth.role_id
     *
     * @param roleId the value for power_role_auth.role_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}