package com.zuo.aqiproject.entity;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zuogaocan
 * @since 2022-05-29
 */
@ApiModel(value = "Prediction对象", description = "")
public class Prediction implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city;

    private Integer first;

    private Integer second;

    private Integer third;

    private Integer fourth;

    private Integer fifth;

    private Integer sixth;

    private Integer seventh;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }
    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
    public Integer getThird() {
        return third;
    }

    public void setThird(Integer third) {
        this.third = third;
    }
    public Integer getFourth() {
        return fourth;
    }

    public void setFourth(Integer fourth) {
        this.fourth = fourth;
    }
    public Integer getFifth() {
        return fifth;
    }

    public void setFifth(Integer fifth) {
        this.fifth = fifth;
    }
    public Integer getSixth() {
        return sixth;
    }

    public void setSixth(Integer sixth) {
        this.sixth = sixth;
    }
    public Integer getSeventh() {
        return seventh;
    }

    public void setSeventh(Integer seventh) {
        this.seventh = seventh;
    }

    @Override
    public String toString() {
        return "Prediction{" +
            "city=" + city +
            ", first=" + first +
            ", second=" + second +
            ", third=" + third +
            ", fourth=" + fourth +
            ", fifth=" + fifth +
            ", sixth=" + sixth +
            ", seventh=" + seventh +
        "}";
    }
}
