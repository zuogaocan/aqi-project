package com.zuo.aqiproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zuo.aqiproject.entity.Prediction;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-29
 */
public interface IPredictionService extends IService<Prediction> {

    int[] findByCity(String city);
}
