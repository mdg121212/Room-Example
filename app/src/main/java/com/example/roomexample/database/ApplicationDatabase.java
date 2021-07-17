package com.example.roomexample.database;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import com.example.roomexample.database.utilities.AppTypeConverters;
import com.example.roomexample.entities.Note;
import com.example.roomexample.entities.PostScript;


@Database(entities = {Note.class, PostScript.class}, version = 1, exportSchema = false)
@TypeConverters(AppTypeConverters.class)
public abstract class ApplicationDatabase extends RoomDatabase {

    private static ApplicationDatabase instance;

    public static synchronized ApplicationDatabase getInstance(Context context) {
    if(instance == null){
        instance = Room.databaseBuilder(context.getApplicationContext(), ApplicationDatabase.class, "app_db")
                //.addMigrations(instance.migration1to2)
                .fallbackToDestructiveMigration()//THIS IS NOT RECOMMENDED
                .addCallback(roomCallBack)
                .allowMainThreadQueries() //THIS IS NOT RECOMMENDED
                .build();
    }
    return instance;
    };

    private static RoomDatabase.Callback roomCallBack = new RoomDatabase.Callback(){

    };

}
