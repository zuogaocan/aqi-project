//package com.zuo.aqiproject;
//
//
//import com.baomidou.mybatisplus.generator.FastAutoGenerator;
//import com.baomidou.mybatisplus.generator.config.OutputFile;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//
//import java.util.Collections;
//
//
///**
// * @author zgc
// */
//public class Generate {
//    public static void main(String[] args) {
//        FastAutoGenerator.create("jdbc:mysql://101.42.90.74:3306/aqi", "aqi", "123456")
//                .globalConfig(builder -> {
//                    builder.author("zuogaocan") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
//                            .outputDir("src\\main\\java")// 指定输出目录
//                            .disableOpenDir();
//                })
//                .packageConfig(builder -> {
//                    builder.parent("com.zuo") // 设置父包名
//                            .moduleName("aqiproject") // 设置父包模块名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, "src\\main\\resources\\static")); // 设置mapperXml生成路径
//                })
//                .strategyConfig(builder -> {
//                    builder.addInclude("prediction") // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
//                })
//                .templateEngine(new FreemarkerTemplateEngine())
//                .execute();
//    }
//}