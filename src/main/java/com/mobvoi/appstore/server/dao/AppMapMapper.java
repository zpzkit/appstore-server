package com.mobvoi.appstore.server.dao;

import com.mobvoi.appstore.server.model.AppMap;

public interface AppMapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppMap record);

    int insertSelective(AppMap record);

    AppMap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppMap record);

    int updateByPrimaryKey(AppMap record);
}