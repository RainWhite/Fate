package com.my.fate.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/11/19 11:41
 */

public interface GenericService<T, PK extends Serializable> {

    /**
     * 查询所有对象
     *
     * @return
     */
    List<T> listAll();

    /**
     * 获取单条数据
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(final PK id);

    /**
     * 插入数据
     *
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新单条数据
     * @param entity
     * @return
     */
    int updateByPrimaryKey(T entity);

    /**
     * 删除单条数据
     * @param id
     * @return
     */
    int deleteByPrimaryKey(final PK id);


}
