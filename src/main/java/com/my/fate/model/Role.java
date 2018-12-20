package com.my.fate.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:26
 */

public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编号
     */
    private Integer roleId;

    /**
     * 角色英文名称
     */
    private String roleNameEn;

    /**
     * 角色中文名称
     */
    private String roleNameZh;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleNameEn() {
        return roleNameEn;
    }

    public void setRoleNameEn(String roleNameEn) {
        this.roleNameEn = roleNameEn == null ? null : roleNameEn.trim();
    }

    public String getRoleNameZh() {
        return roleNameZh;
    }

    public void setRoleNameZh(String roleNameZh) {
        this.roleNameZh = roleNameZh == null ? null : roleNameZh.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}