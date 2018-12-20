package com.my.fate.dao;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/11/19 11:14
 */

public interface GenericDao <T, PK extends Serializable> {

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
     * 更新数据
     *
     * @param entity
     * @return
     */
    int updateByPrimaryKey(T entity);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 查询数据列表
     *
     * @param page
     * @return
     */
   // List<T> searchPage(Page<T> page);

}
