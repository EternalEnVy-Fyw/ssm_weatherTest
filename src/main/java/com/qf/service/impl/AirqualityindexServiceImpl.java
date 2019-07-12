package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.bean.Airqualityindex;
import com.qf.dao.AirqualityindexMapper;
import com.qf.service.AirqualityindexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AirqualityindexServiceImpl implements AirqualityindexService {

    @Resource
    private AirqualityindexMapper airqualityindexMapper;

    @Override
    public PageInfo<Airqualityindex> findAllAir(Airqualityindex airqualityindex, int index, int size) {
        PageHelper.startPage(index,size);
        List<Airqualityindex> list = airqualityindexMapper.findAllAir(airqualityindex);
        PageInfo<Airqualityindex> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int k = airqualityindexMapper.deleteByPrimaryKey(id);
        return k;
    }

    @Override
    public int insert(Airqualityindex record) {
        return 0;
    }

    @Override
    public int insertSelective(Airqualityindex record) {
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(d);
        record.setLastmodifytime(date);
        int k = airqualityindexMapper.insertSelective(record);
        return k;
    }

    @Override
    public Airqualityindex selectByPrimaryKey(Integer id) {
        Airqualityindex airqualityindex = airqualityindexMapper.selectByPrimaryKey(id);
        return airqualityindex;
    }

    @Override
    public int updateByPrimaryKeySelective(Airqualityindex record) {
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(d);
        record.setLastmodifytime(date);
        int k = airqualityindexMapper.updateByPrimaryKeySelective(record);
        return k;
    }

    @Override
    public int updateByPrimaryKey(Airqualityindex record) {
        return 0;
    }
}
