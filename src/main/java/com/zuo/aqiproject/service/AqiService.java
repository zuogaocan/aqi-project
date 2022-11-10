package com.zuo.aqiproject.service;

import com.zuo.aqiproject.entity.Aqi;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zuogaocan
 * @since 2022-04-01
 */
public interface AqiService extends IService<Aqi> {
    List<Aqi> findByCity(String city);

    List<Aqi> findByDate(String city,String date);
}
