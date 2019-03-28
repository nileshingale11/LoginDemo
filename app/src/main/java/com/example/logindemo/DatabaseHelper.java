package com.example.logindemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Student.db";
    private static final String TABLE_NAME = "Student_table";
    SQLiteDatabase db = this.getWritableDatabase();

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(First_Name TEXT NOT NULL,Middle_Name TEXT NOT NULL,Last_Name TEXT NOT NULL,Department TEXT NOT NULL,Course TEXT NOT NULL,Mobile TEXT,Email TEXT,Parent_Name TEXT,Parent_Address TEXT,Parent_Contact TEXT,Room_No INT,Hostel_No INT,User_ID VARCHAR NOT NULL,PRIMARY KEY (User_ID),FOREIGN KEY (User_ID) REFERENCES User(User_ID));");
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ "Student");
        onCreate(db);
    }

}
