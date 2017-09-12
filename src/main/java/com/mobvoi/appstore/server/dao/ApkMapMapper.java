package com.mobvoi.appstore.server.dao;

import com.mobvoi.appstore.server.model.ApkMap;
import com.mobvoi.appstore.server.model.ApkMapKey;

public interface ApkMapMapper {
    int deleteByPrimaryKey(ApkMapKey key);

    int insert(ApkMap record);

    int insertSelective(ApkMap record);

    ApkMap selectByPrimaryKey(ApkMapKey key);

    int updateByPrimaryKeySelective(ApkMap record);

    int updateByPrimaryKey(ApkMap record);
}