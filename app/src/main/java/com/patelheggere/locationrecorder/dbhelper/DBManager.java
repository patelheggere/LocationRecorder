package com.patelheggere.locationrecorder.dbhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.patelheggere.locationrecorder.models.LocationTrack;

public class DBManager {
    private DatabaseHelper dbHelper;

    private Context context;

    private SQLiteDatabase database;

    public DBManager(Context c) {
        context = c;
    }

    public DBManager open() throws SQLException {
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    public void insert(LocationTrack object) {
        ContentValues contentValue = new ContentValues();
        contentValue.put(DatabaseHelper.VILLAGE_NAME, object.getmVillageName());
        contentValue.put(DatabaseHelper.ELEVATION, object.getmElevation());
        contentValue.put(DatabaseHelper.WARD_NUMBER, object.getmWardNumber());
        contentValue.put(DatabaseHelper.LAT, object.getmLatitude());
        contentValue.put(DatabaseHelper.LON, object.getmLongitude());
        contentValue.put(DatabaseHelper.DATE, object.getmTime());
        System.out.println("Inserted:"+database.insert(DatabaseHelper.TABLE_NAME, null, contentValue));
    }

    public Cursor fetch() {
        String[] columns = new String[] { DatabaseHelper._ID,  DatabaseHelper.NAME };
        Cursor cursor;// = database.query(DatabaseHelper.TABLE_NAME, columns, null, null, null, null, null);
        cursor = database.rawQuery("SELECT * FROM "+DatabaseHelper.TABLE_NAME, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }
/*
    public int update(long _id, String name, String desc) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.SUBJECT, name);
        contentValues.put(DatabaseHelper.DESC, desc);
        int i = database.update(DatabaseHelper.TABLE_NAME, contentValues, DatabaseHelper._ID + " = " + _id, null);
        return i;
    }*/

    public void delete(long _id) {
        database.delete(DatabaseHelper.TABLE_NAME, DatabaseHelper._ID + "=" + _id, null);
    }
}