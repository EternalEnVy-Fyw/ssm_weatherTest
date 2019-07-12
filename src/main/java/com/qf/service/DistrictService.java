package com.qf.service;

import com.qf.bean.District;

import java.util.List;

public interface DistrictService {
    List<District> findAllDis();


    int deleteByPrimaryKey(Integer id);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}
