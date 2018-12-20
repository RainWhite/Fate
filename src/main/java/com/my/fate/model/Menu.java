package com.my.fate.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:26
 */

public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单编号
     */
    private Integer menuId;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 父级菜单编号
     */
    private Integer parentId;

    private String path;

    private String component;

    private String iconcls;

    private Boolean keepalive;

    private Boolean requireauth;

    /**
     * 角色集
     */
    private List<Role> roleList;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls == null ? null : iconcls.trim();
    }

    public Boolean getKeepalive() {
        return keepalive;
    }

    public void setKeepalive(Boolean keepalive) {
        this.keepalive = keepalive;
    }

    public Boolean getRequireauth() {
        return requireauth;
    }

    public void setRequireauth(Boolean requireauth) {
        this.requireauth = requireauth;
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

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}