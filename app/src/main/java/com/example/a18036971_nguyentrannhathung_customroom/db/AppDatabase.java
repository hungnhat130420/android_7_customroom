package com.example.a18036971_nguyentrannhathung_customroom.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.iuh.mobile_lab07.dao.UserDao;
import com.iuh.mobile_lab07.entity.User;

@Database(entities = {User.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
