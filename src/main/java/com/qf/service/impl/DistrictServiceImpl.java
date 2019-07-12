package com.qf.service.impl;

import com.qf.bean.District;
import com.qf.dao.DistrictMapper;
import com.qf.service.DistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Resource
    private DistrictMapper districtMapper;

    @Override
    public List<District> findAllDis() {
        List<District> list = districtMapper.findAllDis();
        return list;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(District record) {
        return 0;
    }

    @Override
    public int insertSelective(District record) {
        return 0;
    }

    @Override
    public District selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(District record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(District record) {
        return 0;
    }
}
