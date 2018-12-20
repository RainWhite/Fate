package com.my.fate.service.impl;

import com.my.fate.dao.UserInfoDao;
import com.my.fate.model.UserInfo;
import com.my.fate.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:54
 */

@Service("UserInfoService")
//@CacheConfig(cacheNames="userCache")
public class UserInfoServiceImpl extends GenericServiceImpl<UserInfo,String> implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    public UserInfoServiceImpl(UserInfoDao userInfoDao) {
        super(userInfoDao);
        this.userInfoDao = userInfoDao;
    }

   // @Cacheable(value = "test", key = "'userList'")
    public List<UserInfo> listAll() {

        List<UserInfo> list = userInfoDao.listAll();
        return list;
    }
}
