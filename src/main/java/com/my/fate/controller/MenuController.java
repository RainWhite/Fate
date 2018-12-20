package com.my.fate.controller;

import com.my.fate.model.Menu;
import com.my.fate.model.User;
import com.my.fate.model.UserInfo;
import com.my.fate.service.MenuService;
import com.my.fate.service.UserInfoService;
import com.my.fate.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/11/19 14:08
 */

@Slf4j
@RestController("MenuController")
@RequestMapping(value = "/menu")
public class MenuController extends GenericController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/list")
    public List<Menu> list(){

        return menuService.listAll();
    }
}
