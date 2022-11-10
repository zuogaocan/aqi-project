package com.zuo.aqiproject.mapper;

import com.zuo.aqiproject.entity.Aqi;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zuogaocan
 * @since 2022-04-01
 */
@Mapper
public interface AqiMapper extends BaseMapper<Aqi> {
    List<Aqi> findByCity(String city);
    List<Aqi> findByDate(String city,String h_date);
}
