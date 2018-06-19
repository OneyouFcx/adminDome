package com.icei.domain;

import java.util.Date;

public class PowerRole {
    private Integer roleId;
    private String roleName;
    private String roleDescribe;
    private Date roleCreateTime;
    private Date roleUpdateTime;
    private String roleTag;

    public String getRoleTag() {
        return roleTag;
    }
    public void setRoleTag(String roleTag) {
        this.roleTag = roleTag;
    }
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleDescribe() {
        return roleDescribe;
    }
    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }
    public Date getRoleCreateTime() {
        return roleCreateTime;
    }
    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }
    public Date getRoleUpdateTime() {
        return roleUpdateTime;
    }
    public void setRoleUpdateTime(Date roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }
}