package com.yehowah.hellokotlin_817.db.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

@Entity(indexes = {@Index(value = "cityName"),@Index(value ="districtName")})
public class DistrictBean {
    @Id(autoincrement = true)
    private Long id ;
    private String cityName="";
    private String districtName;
    private int level ;// CityUtils.LEVEL_DISTRICT;

@Generated(hash = 761790583)
    public DistrictBean(Long id, String cityName, String districtName, int level) {
        this.id = id;
        this.cityName = cityName;
        this.districtName = districtName;
        this.level = level;
    }

    @Generated(hash = 326445391)
    public DistrictBean() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return this.districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
