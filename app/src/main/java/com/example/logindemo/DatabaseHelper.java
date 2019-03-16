package com.example.logindemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Student.db";
    public static final String TABLE_NAME = "Student_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "DEPARTMENT";
    public static final String COL_4 = "ROOM_NO";
    public static final String COL_5 = "HOSTEL_NO";
    public static final String COL_6 = "ADDRESS";
    public static final String COL_7 = "PHONE";
    public static final String COL_8 = "EMAIL_iD";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,DEPARTMENT TEXT,ROOM_NO INT,HOSTEL_NO INT,ADDRESS TEXT,PHONE TEXT,EMAIL_ID TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(db);
    }
}
