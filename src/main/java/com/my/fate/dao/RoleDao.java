package com.my.fate.dao;


import com.my.fate.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao extends GenericDao<Role,Integer>{

    /**
     * 根据用户编号获取角色集
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(@Param("userId") String userId);

    /**
     * 根据菜单编号获取角色集
     * @param menuId
     * @return
     */
    List<Role> selectRolesByMenuId(@Param("menuId") int menuId);
}