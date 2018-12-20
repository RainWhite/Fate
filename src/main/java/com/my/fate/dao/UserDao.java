package com.my.fate.dao;

import com.my.fate.model.User;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:26
 */

public interface UserDao extends GenericDao<User,String>{

    /**
     * 更新最后登录时间
     *
     * @param userId
     * @return
     */
    int updateLoginTimeByPrimaryKey(String userId);

}