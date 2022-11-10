package com.zuo.aqiproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zuo.aqiproject.entity.Prediction;
import com.zuo.aqiproject.mapper.PredictionMapper;
import com.zuo.aqiproject.service.IPredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-29
 */
@Service
public class PredictionServiceImpl extends ServiceImpl<PredictionMapper, Prediction> implements IPredictionService {
    @Autowired
    private PredictionMapper predictionMapper;
    @Override
    public int[] findByCity(String city) {
        QueryWrapper<Prediction> predictionQueryWrapper = new QueryWrapper<>();
        predictionQueryWrapper.eq("city",city);
        Prediction one = predictionMapper.selectOne(predictionQueryWrapper);
        int [] arr = new int[7];
        arr[0] = one.getFirst();
        arr[1] = one.getSecond();
        arr[2] = one.getThird();
        arr[3] = one.getFourth();
        arr[4] = one.getFifth();
        arr[5] = one.getSixth();
        arr[6] = one.getSeventh();
        return arr;
    }
}
