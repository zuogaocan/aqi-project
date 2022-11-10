package com.zuo.aqiproject.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-07
 */
@Data
@ApiModel(value = "Station对象", description = "")
public class Station implements Serializable {

    private static final long serialVersionUID = 1L;

    private String POI_ID;

    private Double POI_Longitude;

    private Double POI_Latitude;

    private String POI_Name;

    private String POI_Type;

    private Long Location_ID;

    private String Location_Name_ZH;

    private String Location_Name_EN;

    private String Adm2_ZH;

    private String Adm2_EN;

    private String Adm1_ZH;

    private String Adm1_EN;

}
