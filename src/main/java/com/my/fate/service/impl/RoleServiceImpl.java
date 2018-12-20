package com.my.fate.service.impl;

import com.my.fate.dao.RoleDao;
import com.my.fate.model.Role;
import com.my.fate.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:54
 */

@Service("RoleService")
//@CacheConfig(cacheNames="userCache")
public class RoleServiceImpl extends GenericServiceImpl<Role,Integer> implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        super(roleDao);
        this.roleDao = roleDao;
    }

   // @Cacheable(value = "test", key = "'userList'")
    public List<Role> listAll() {

        List<Role> list = roleDao.listAll();
        return list;
    }
}
