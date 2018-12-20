package com.my.fate.service;

import com.my.fate.model.User;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:53
 */

public interface UserService extends GenericService<User, String> {

    /**
     * 更新最后登录时间
     *
     * @param userId
     * @return
     */
    int updateLoginTimeByPrimaryKey(String userId);
}
