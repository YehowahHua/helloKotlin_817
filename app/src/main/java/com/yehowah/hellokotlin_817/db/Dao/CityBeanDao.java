package com.yehowah.hellokotlin_817.db.Dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yehowah.hellokotlin_817.db.Bean.CityBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CITY_BEAN".
*/
public class CityBeanDao extends AbstractDao<CityBean, Long> {

    public static final String TABLENAME = "CITY_BEAN";

    /**
     * Properties of entity CityBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CityName = new Property(1, String.class, "cityName", false, "CITY_NAME");
        public final static Property ProvinceName = new Property(2, String.class, "provinceName", false, "PROVINCE_NAME");
        public final static Property Level = new Property(3, int.class, "level", false, "LEVEL");
    }


    public CityBeanDao(DaoConfig config) {
        super(config);
    }
    
    public CityBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CITY_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CITY_NAME\" TEXT," + // 1: cityName
                "\"PROVINCE_NAME\" TEXT," + // 2: provinceName
                "\"LEVEL\" INTEGER NOT NULL );"); // 3: level
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_CITY_BEAN_CITY_NAME ON \"CITY_BEAN\"" +
                " (\"CITY_NAME\" ASC);");
        db.execSQL("CREATE INDEX " + constraint + "IDX_CITY_BEAN_PROVINCE_NAME ON \"CITY_BEAN\"" +
                " (\"PROVINCE_NAME\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CITY_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CityBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String cityName = entity.getCityName();
        if (cityName != null) {
            stmt.bindString(2, cityName);
        }
 
        String provinceName = entity.getProvinceName();
        if (provinceName != null) {
            stmt.bindString(3, provinceName);
        }
        stmt.bindLong(4, entity.getLevel());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CityBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String cityName = entity.getCityName();
        if (cityName != null) {
            stmt.bindString(2, cityName);
        }
 
        String provinceName = entity.getProvinceName();
        if (provinceName != null) {
            stmt.bindString(3, provinceName);
        }
        stmt.bindLong(4, entity.getLevel());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CityBean readEntity(Cursor cursor, int offset) {
        CityBean entity = new CityBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // cityName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // provinceName
            cursor.getInt(offset + 3) // level
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CityBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCityName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setProvinceName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLevel(cursor.getInt(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CityBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CityBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CityBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
