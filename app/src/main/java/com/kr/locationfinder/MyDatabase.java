package com.kr.locationfinder;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "Geo_location.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "my_locations";

    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_ADDRESS = "location_address";
    private static final String COLUMN_LATITUDE = "location_latitude";
    private static final String COLUMN_LONGITUDE = "location_longitude";

    MyDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE " + TABLE_NAME
                        + " ("+COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + COLUMN_ADDRESS + " TEXT, "
                        + COLUMN_LATITUDE + " DOUBLE, "
                        + COLUMN_LONGITUDE + " DOUBLE);";
        db.execSQL(query);

        String data1 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (1, 'Toronto', 43.653225, -79.383186);";
        db.execSQL(data1);

        String data2 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (2, 'SEOUL', 37.5666791, 126.9782914);";
        db.execSQL(data2);

        String data3 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (3, 'São Paulo', -23.5506507, -46.6333824);";
        db.execSQL(data3);

        String data4 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (4, 'Bombay', 19.0759899, 72.8773928);";
        db.execSQL(data4);

        String data5 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (5, 'JAKARTA', -6.1753942, 106.827183);";
        db.execSQL(data5);

        String data6 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (6, 'Karachi', 24.8546842, 67.0207055);";
        db.execSQL(data6);

        String data7 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (7, 'Moscow', 55.7504461, 37.6174943);";
        db.execSQL(data7);

        String data8 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (8, 'Istanbul', 41.0096334, 28.9651646);";
        db.execSQL(data8);

        String data9 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (9, 'Shanghai', 31.2322758, 121.4692071);";
        db.execSQL(data9);

        String data10 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (10, 'TOKYO', 35.6828387, 139.7594549);";
        db.execSQL(data10);

        String data11 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (11, 'BANGKOK', 13.7525438, 100.4934734);";
        db.execSQL(data11);

        String data12 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (12, 'BEIJING', 39.906217, 116.3912757);";
        db.execSQL(data12);

        String data13 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (13, 'LONDON', 51.5073219, -0.1276474);";
        db.execSQL(data13);

        String data14 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (14, 'HongKong', 22.2793278, 114.1628131);";
        db.execSQL(data14);

        String data15 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (15, 'TEHRAN', 35.6892523, 51.3896004);";
        db.execSQL(data15);

        String data16 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (16, 'BOGOTA', 4.6533326, -74.083652);";
        db.execSQL(data16);

        String data17 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (17, 'Tianjin', 39.0856735, 117.1951073);";
        db.execSQL(data17);

        String data18 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (18, 'LIMA', -12.0621065, -77.0365256);";
        db.execSQL(data18);

        String data19 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (19, 'Rio de Janeiro', -22.9110137,-43.2093727);";
        db.execSQL(data19);

        String data20 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (20, 'Lahore', 31.5656822, 74.3141829);";
        db.execSQL(data20);

        String data21 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (21, 'Bogor', -6.5962986, 106.7972421);";
        db.execSQL(data21);

        String data22 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (22, 'SANTIAGO', 9.8694792, -83.7980749);";
        db.execSQL(data22);

        String data23 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (23, 'St Petersburg', 59.938732, 30.316229);";
        db.execSQL(data23);

        String data24 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (24, 'Shenyang', 41.6749893, 123.458674);";
        db.execSQL(data24);

        String data25 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (25, 'Calcutta', 22.5726723, 88.3638815);";
        db.execSQL(data25);

        String data26 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (26, 'Wuhan', 30.5951051, 114.2999353);";
        db.execSQL(data26);

        String data27 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (27, 'Sydney', -33.768528, 150.956856);";
        db.execSQL(data27);

        String data28 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (28, 'Guangzhou', 23.1301964, 113.2592945);";
        db.execSQL(data28);

        String data29 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (29, 'SINGAPORE', 1.357107, 103.8194992);";
        db.execSQL(data29);

        String data30 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (30, 'Madras', 13.0836939, 80.270186);";
        db.execSQL(data30);

        String data31 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (31, 'Havanna', 23.135305, -82.3589631);";
        db.execSQL(data31);

        String data32 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (32, 'BAGHDAD', 33.3024309, 44.3787992);";
        db.execSQL(data32);

        String data33 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (33, 'Giza', 29.9870753, 31.2118063);";
        db.execSQL(data33);

        String data34 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (34, 'Pusan', 35.1799528, 129.0752365);";
        db.execSQL(data34);

        String data35 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (35, 'Salvador', 13.8000382, -88.9140683);";
        db.execSQL(data35);

        String data36 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (36, 'Los Angeles', 34.0536909, -118.242766);";
        db.execSQL(data36);

        String data38 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (37, 'Yokohama', 35.444991, 139.636768);";
        db.execSQL(data38);

        String data39 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (38, 'DHAKA', 23.7861979, 90.4026151);";
        db.execSQL(data39);

        String data40 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (39, 'BERLIN', 52.5170365, 13.3888599);";
        db.execSQL(data40);

        String data41 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (40, 'Alexandria', 31.199004, 29.894378);";
        db.execSQL(data41);

        String data42 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (41, 'Bangalore', 12.9767936, 77.590082);";
        db.execSQL(data42);

        String data43 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (42, 'Malang', -7.9771206, 112.6340291);";
        db.execSQL(data43);

        String data44 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (43, 'Chongqing', 29.5647398, 106.5478767);";
        db.execSQL(data44);

        String data45 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (44, 'Hyderabad', 17.360589, 78.4740613);";
        db.execSQL(data45);

        String data46 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (45, 'BUENOS AIRES', -34.6075682, -58.4370894);";
        db.execSQL(data46);

        String data47 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (46, 'Ahmedabad', 23.022505, 72.571365);";
        db.execSQL(data47);

        String data48 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (48, 'Chicago', 41.878113, -87.629799);";
        db.execSQL(data48);

        String data49 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (49, 'Xian', 33.622532, 113.341751);";
        db.execSQL(data49);

        String data50 = "INSERT INTO " + TABLE_NAME
                + " (" + COLUMN_ID +", " +
                COLUMN_ADDRESS + ", " +
                COLUMN_LATITUDE + ", " +
                COLUMN_LONGITUDE + ") VALUES (50, 'PYONGYANG', 39.021389, 125.752747);";
        db.execSQL(data50);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }

    void addADDRESS(String address){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_ADDRESS, address);
        long result = db.insert(TABLE_NAME, null, cv);
        if(result == -1){
            Toast.makeText(context, "Insert Failed!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Insert Successful!", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readDB(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    void  updateData(String address, String row_id){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ADDRESS, address);
        long result = db.update(TABLE_NAME, cv, "_id=?", new String[]{row_id});
        if(result == -1){
            Toast.makeText(context, "Update Failed!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Update Successful!", Toast.LENGTH_SHORT).show();
        }
    }

    void deleteRow(String row_id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_NAME, "_id=?", new String[]{row_id});
        if(result == -1){
            Toast.makeText(context, "Delete Failed!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Delete Successful!", Toast.LENGTH_SHORT).show();
        }
    }
}
