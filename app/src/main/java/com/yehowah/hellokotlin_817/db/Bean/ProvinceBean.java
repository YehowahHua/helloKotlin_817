package com.yehowah.hellokotlin_817.db.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

@Entity(indexes = {@Index(value = "provinceName")})
public class ProvinceBean {
    @Id(autoincrement = true)
    private Long id;
    private String provinceName;
    private int level;

    @Generated(hash = 44464942)
    public ProvinceBean(Long id, String provinceName, int level) {
        this.id = id;
        this.provinceName = provinceName;
        this.level = level;
    }

    @Generated(hash = 1410713511)
    public ProvinceBean() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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
