package com.zuo.aqiproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zuo.aqiproject.entity.Station;
import com.zuo.aqiproject.mapper.StationMapper;
import com.zuo.aqiproject.service.IStationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-07
 */
@Service
public class StationServiceImpl extends ServiceImpl<StationMapper, Station> implements IStationService {
    @Autowired StationMapper stationMapper;
    @Override
    public List<Station> findById(String stationIds) {
        ArrayList<Station> stations = new ArrayList<>();
        String[] s1 = stationIds.split(" ");

        for (String s : s1) {
            System.out.println(s);
            QueryWrapper<Station> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("POI_ID",s);
            if (stationMapper.selectOne(queryWrapper) ==null){
                Station station = new Station();
                station.setPOI_ID(s+"监测点坐标未收录");
                stations.add(station);
            }
            else {
                stations.add(stationMapper.selectOne(queryWrapper));
            }
        }
        return stations;
    }
}
