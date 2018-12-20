package com.my.fate.service.impl;

import com.my.fate.dao.MenuDao;
import com.my.fate.dao.UserDao;
import com.my.fate.model.Menu;
import com.my.fate.model.User;
import com.my.fate.service.MenuService;
import com.my.fate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:54
 */

@Service("MenuService")
//@CacheConfig(cacheNames="userCache")
public class MenuServiceImpl extends GenericServiceImpl<Menu,Integer> implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Autowired
    public MenuServiceImpl(MenuDao menuDao) {
        super(menuDao);
        this.menuDao = menuDao;
    }

   // @Cacheable(value = "test", key = "'userList'")
    public List<Menu> listAll() {

        List<Menu> list = menuDao.listAll();
        return list;
    }
}
