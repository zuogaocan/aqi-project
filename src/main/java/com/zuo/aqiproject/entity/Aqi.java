package com.zuo.aqiproject.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zuogaocan
 * @since 2022-04-01
 */

@Data
public class Aqi implements Serializable {

    private static final long serialVersionUID = 1L;


    private String date;

    private String grade;

    private Integer AQI;

    private Integer rank;

    private Integer PM25;

    private Integer PM10;

    private Integer So2;

    private Integer No2;

    private Double Co;

    private Integer O3;

    @Override
    public String toString() {
        return "Aqi{" +
                "data='" + date + '\'' +
                ", grade='" + grade + '\'' +
                ", AQI=" + AQI +
                ", rank=" + rank +
                ", status=200"+
                ", PM2_5=" + PM25 +
                ", PM10=" + PM10 +
                ", So2=" + So2 +
                ", No2=" + No2 +
                ", Co=" + Co +
                ", O3=" + O3 +
                '}';
    }
}
