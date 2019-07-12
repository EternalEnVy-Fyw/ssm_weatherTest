package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.bean.Airqualityindex;

import java.util.List;

public interface AirqualityindexService {
    PageInfo<Airqualityindex> findAllAir(Airqualityindex airqualityindex,int index,int size);


    int deleteByPrimaryKey(Integer id);

    int insert(Airqualityindex record);

    int insertSelective(Airqualityindex record);

    Airqualityindex selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Airqualityindex record);

    int updateByPrimaryKey(Airqualityindex record);
}
