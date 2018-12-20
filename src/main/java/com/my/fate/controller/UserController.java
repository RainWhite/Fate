package com.my.fate.controller;

import com.my.fate.model.User;
import com.my.fate.model.UserInfo;
import com.my.fate.service.UserInfoService;
import com.my.fate.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.access.intercept.DefaultFilterInvocationSecurityMetadataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/11/19 14:08
 */

@Slf4j
@RestController("UserController")
@RequestMapping(value = "/user")
public class UserController extends GenericController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/userList")
    public List<User> userList(){

        return userService.listAll();
    }

    @RequestMapping(value = "/userInfoList")
    public List<UserInfo> userInfoList() {

        return userInfoService.listAll();
    }

    @RequestMapping(value = "/get")
    public User get(){

        return userService.selectByPrimaryKey("+8618810001111");
    }
}
