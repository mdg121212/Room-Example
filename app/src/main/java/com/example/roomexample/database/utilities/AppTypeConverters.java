package com.example.roomexample.database.utilities;

import android.arch.persistence.room.TypeConverter;

import com.example.roomexample.entities.PostScript;
import com.google.gson.Gson;

public class AppTypeConverters {
    private static Gson gson = new Gson();
    @TypeConverter
    public static PostScript fromPostScriptJsonString(String postScriptJsonString){
        return postScriptJsonString == null ? null : gson.fromJson(postScriptJsonString, PostScript.class);
    }
    @TypeConverter
    public static String postScriptToString(PostScript postScript){
        return  postScript == null ? null : gson.toJson(postScript);
    }
}
