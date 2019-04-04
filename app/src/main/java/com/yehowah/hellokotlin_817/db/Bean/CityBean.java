package com.yehowah.hellokotlin_817.db.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

@Entity(indexes = {@Index(value = "cityName"),@Index(value = "provinceName")})
public class CityBean {
    @Id(autoincrement = true)
    private Long  id ;
    private String cityName;
    private String provinceName;
    private int level ;//CityUtils.LEVEL_CITY;

    @Generated(hash = 989539543)
    public CityBean(Long id, String cityName, String provinceName, int level) {
        this.id = id;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.level = level;
    }

    @Generated(hash = 273649691)
    public CityBean() {
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

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}
