package com.university.graduation.domain;

import java.util.Date;

public class sysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.sys_role
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    private String sysRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.sys_rolename
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    private String sysRolename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.description
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.state
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_time
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.update_time
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.sys_role
     *
     * @return the value of sys_role.sys_role
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public String getSysRole() {
        return sysRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.sys_role
     *
     * @param sysRole the value for sys_role.sys_role
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public void setSysRole(String sysRole) {
        this.sysRole = sysRole == null ? null : sysRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.sys_rolename
     *
     * @return the value of sys_role.sys_rolename
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public String getSysRolename() {
        return sysRolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.sys_rolename
     *
     * @param sysRolename the value for sys_role.sys_rolename
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public void setSysRolename(String sysRolename) {
        this.sysRolename = sysRolename == null ? null : sysRolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.description
     *
     * @return the value of sys_role.description
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.description
     *
     * @param description the value for sys_role.description
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.state
     *
     * @return the value of sys_role.state
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.state
     *
     * @param state the value for sys_role.state
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_time
     *
     * @param createTime the value for sys_role.create_time
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.update_time
     *
     * @return the value of sys_role.update_time
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.update_time
     *
     * @param updateTime the value for sys_role.update_time
     *
     * @mbggenerated Tue Oct 02 10:16:48 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}