package com.zuo.aqiproject.controller;

import com.zuo.aqiproject.entity.Aqi;
import com.zuo.aqiproject.service.AqiService;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zuogaocan
 * @since 2022-04-05
 */
@Controller
@ResponseBody
@RequestMapping("/aqi")
@CrossOrigin
public class AqiController {
    @Autowired
    private AqiService aqiService;
    @GetMapping("/list")
    public List<Aqi> find(){
        return this.aqiService.list();
    }


    @GetMapping("/lists")
    public List<Aqi> findByCity(@RequestParam("city") String city) throws BadHanyuPinyinOutputFormatCombination {
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        //拼音小写
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //不带声调
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        String h_city = PinyinHelper.toHanYuPinyinString(city,format,"",true);
        return this.aqiService.findByCity(h_city);
    }
}