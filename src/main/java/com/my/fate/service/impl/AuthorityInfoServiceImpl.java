package com.my.fate.service.impl;

import com.my.fate.model.User;
import com.my.fate.service.AuthorityInfoService;
import com.my.fate.service.MenuService;
import com.my.fate.service.RoleService;
import com.my.fate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:54
 */

@Service("AuthorityService")
//@CacheConfig(cacheNames="userCache")
public class AuthorityInfoServiceImpl implements AuthorityInfoService {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuService menuService;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        User user = userService.selectByPrimaryKey(userId);
        if(user == null) {
            throw new UsernameNotFoundException("账号不存在");
        }
        return user;
    }
}
