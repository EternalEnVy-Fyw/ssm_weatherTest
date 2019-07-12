package com.qf.dao;

import com.qf.bean.Airqualityindex;

import java.util.List;

public interface AirqualityindexMapper {
    List<Airqualityindex> findAllAir(Airqualityindex airqualityindex);

    int deleteByPrimaryKey(Integer id);

    int insert(Airqualityindex record);

    int insertSelective(Airqualityindex record);

    Airqualityindex selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Airqualityindex record);

    int updateByPrimaryKey(Airqualityindex record);
}
