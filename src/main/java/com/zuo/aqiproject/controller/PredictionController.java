package com.zuo.aqiproject.controller;

import com.zuo.aqiproject.entity.Prediction;
import com.zuo.aqiproject.service.IPredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-29
 */
@Controller
@RequestMapping("/aqi")
@ResponseBody
@CrossOrigin
public class PredictionController {
    @Autowired
    private IPredictionService iPredictionService;
    @GetMapping("/prediction")
    public int[] findById(@RequestParam("city") String city){
        return iPredictionService.findByCity(city);
    }
}
