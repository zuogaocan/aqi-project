package com.zuo.aqiproject.service.impl;

import com.zuo.aqiproject.entity.Aqi;
import com.zuo.aqiproject.mapper.AqiMapper;
import com.zuo.aqiproject.service.AqiService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zuogaocan
 * @since 2022-04-01
 */
@Service
public class AqiServiceImpl extends ServiceImpl<AqiMapper, Aqi> implements AqiService {

    @Autowired
    AqiMapper aqiMapper;
    @Override
    public List<Aqi> findByCity(String city) {
        return aqiMapper.findByCity(city);
    }

    @Override
    public List<Aqi> findByDate(String city,String date) {
        return aqiMapper.findByDate(city,date);
    }
}
