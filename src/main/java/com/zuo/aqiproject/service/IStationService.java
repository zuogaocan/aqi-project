package com.zuo.aqiproject.service;

import com.zuo.aqiproject.entity.Station;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-07
 */
public interface IStationService extends IService<Station> {

    List<Station> findById(String stationIds);
}
