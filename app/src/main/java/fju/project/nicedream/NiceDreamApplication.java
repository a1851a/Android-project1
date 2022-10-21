package fju.project.nicedream;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLData;
import java.util.Timer;

import fju.project.nicedream.data.db.DataBase;

public class NiceDreamApplication extends Application {

    private static final String TAG = "NiceDreamApplication";

    private static Timer timer = null;

    public static Timer getTimer (){

        timer = new Timer();

        return timer;
    }


}
