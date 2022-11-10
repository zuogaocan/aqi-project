package com.zuo.aqiproject.controller;

import com.zuo.aqiproject.entity.Station;
import com.zuo.aqiproject.service.IStationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-07
 */
@Controller
@RequestMapping("/aqi")
@ResponseBody
@CrossOrigin
public class StationController {
    @Autowired
    private IStationService stationService;
    @ApiOperation(value = "根据StationId查找经纬度")
    @GetMapping("/station")
    public List<Station> findById(@RequestParam("station") String stationIds){
        return stationService.findById(stationIds);
    }

}
