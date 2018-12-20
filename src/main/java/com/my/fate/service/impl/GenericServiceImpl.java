package com.my.fate.service.impl;

import com.my.fate.dao.GenericDao;
import com.my.fate.service.GenericService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/11/19 14:02
 */

public class GenericServiceImpl <T, PK extends Serializable> implements GenericService<T, PK> {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected GenericDao<T, PK> dao;

    public GenericServiceImpl(){

    }

    public GenericServiceImpl(GenericDao<T, PK> genericDao) {
        this.dao = genericDao;
    }

    public List<T> listAll() {
        return dao.listAll();
    }

    @Override
    public T selectByPrimaryKey(PK id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int insert(T entity) {
        dao.insert(entity);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(T entity) {
        dao.updateByPrimaryKey(entity);
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(PK id) {
        dao.deleteByPrimaryKey(id);
        return 0;
    }
}
