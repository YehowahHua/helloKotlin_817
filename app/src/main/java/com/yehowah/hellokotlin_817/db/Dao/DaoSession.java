package com.yehowah.hellokotlin_817.db.Dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yehowah.hellokotlin_817.db.Bean.CityBean;
import com.yehowah.hellokotlin_817.db.Bean.DistrictBean;
import com.yehowah.hellokotlin_817.db.Bean.ProvinceBean;

import com.yehowah.hellokotlin_817.db.Dao.CityBeanDao;
import com.yehowah.hellokotlin_817.db.Dao.DistrictBeanDao;
import com.yehowah.hellokotlin_817.db.Dao.ProvinceBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cityBeanDaoConfig;
    private final DaoConfig districtBeanDaoConfig;
    private final DaoConfig provinceBeanDaoConfig;

    private final CityBeanDao cityBeanDao;
    private final DistrictBeanDao districtBeanDao;
    private final ProvinceBeanDao provinceBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cityBeanDaoConfig = daoConfigMap.get(CityBeanDao.class).clone();
        cityBeanDaoConfig.initIdentityScope(type);

        districtBeanDaoConfig = daoConfigMap.get(DistrictBeanDao.class).clone();
        districtBeanDaoConfig.initIdentityScope(type);

        provinceBeanDaoConfig = daoConfigMap.get(ProvinceBeanDao.class).clone();
        provinceBeanDaoConfig.initIdentityScope(type);

        cityBeanDao = new CityBeanDao(cityBeanDaoConfig, this);
        districtBeanDao = new DistrictBeanDao(districtBeanDaoConfig, this);
        provinceBeanDao = new ProvinceBeanDao(provinceBeanDaoConfig, this);

        registerDao(CityBean.class, cityBeanDao);
        registerDao(DistrictBean.class, districtBeanDao);
        registerDao(ProvinceBean.class, provinceBeanDao);
    }
    
    public void clear() {
        cityBeanDaoConfig.clearIdentityScope();
        districtBeanDaoConfig.clearIdentityScope();
        provinceBeanDaoConfig.clearIdentityScope();
    }

    public CityBeanDao getCityBeanDao() {
        return cityBeanDao;
    }

    public DistrictBeanDao getDistrictBeanDao() {
        return districtBeanDao;
    }

    public ProvinceBeanDao getProvinceBeanDao() {
        return provinceBeanDao;
    }

}
