package com.my.fate.service.impl;

import com.my.fate.dao.UserDao;
import com.my.fate.model.User;
import com.my.fate.service.MenuService;
import com.my.fate.service.RoleService;
import com.my.fate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:54
 */

@Service("UserService")
//@CacheConfig(cacheNames="userCache")
public class UserServiceImpl extends GenericServiceImpl<User,String> implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        super(userDao);
        this.userDao = userDao;
    }

   // @Cacheable(value = "test", key = "'userList'")
    public List<User> listAll() {

        List<User> list = userDao.listAll();
        return list;
    }

    @Override
    public int updateLoginTimeByPrimaryKey(String userId) {
        return userDao.updateLoginTimeByPrimaryKey(userId);
    }

}
