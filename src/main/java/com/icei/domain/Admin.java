package com.icei.domain;

import java.util.List;

public class Admin {
    private Integer adminId;

    private String adminCode;

    private String adminPwd;
    private String adminName;

    private String adminImg;

    private Integer roleId;

    private List<PowerRole> role;

    public List<PowerRole> getRole() {
        return role;
    }
    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.getAdminCode()+"8d78869f470951332959580424d4bf4f";
    }
    public void setRole(List<PowerRole> role) {
        this.role = role;
    }
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_id
     *
     * @param adminId the value for admin.admin_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_code
     *
     * @return the value of admin.admin_code
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public String getAdminCode() {
        return adminCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_code
     *
     * @param adminCode the value for admin.admin_code
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_pwd
     *
     * @return the value of admin.admin_pwd
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public String getAdminPwd() {
        return adminPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_pwd
     *
     * @param adminPwd the value for admin.admin_pwd
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_name
     *
     * @return the value of admin.admin_name
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_name
     *
     * @param adminName the value for admin.admin_name
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_img
     *
     * @return the value of admin.admin_img
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public String getAdminImg() {
        return adminImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_img
     *
     * @param adminImg the value for admin.admin_img
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setAdminImg(String adminImg) {
        this.adminImg = adminImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.role_id
     *
     * @return the value of admin.role_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.role_id
     *
     * @param roleId the value for admin.role_id
     *
     * @mbg.generated Thu Apr 19 10:27:54 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}