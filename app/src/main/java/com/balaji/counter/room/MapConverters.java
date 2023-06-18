package com.balaji.counter.room;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

public class MapConverters {

    @TypeConverter
    public static Map<Integer, Integer> stringToMapIntInt(String value) {
        Type mapType = new TypeToken<Map<Integer, Integer>>() {}.getType();
        return new Gson().fromJson(value, mapType);
    }

    @TypeConverter
    public static String mapIntIntToString(Map<Integer, Integer> value) {
        if (value == null) {
            return "";
        } else {
            return new Gson().toJson(value);
        }
    }

    @TypeConverter
    public static Map<Integer, Double> stringToMapIntDouble(String value) {
        Type mapType = new TypeToken<Map<Integer, Double>>() {}.getType();
        return new Gson().fromJson(value, mapType);
    }

    @TypeConverter
    public static String mapIntDoubleToString(Map<Integer, Double> value) {
        if (value == null) {
            return "";
        } else {
            return new Gson().toJson(value);
        }
    }

    @TypeConverter
    public static String mapIntStringToString(Map<Integer, String> value) {
        if (value == null) {
            return "";
        } else {
            return new Gson().toJson(value);
        }
    }

    @TypeConverter
    public static Map<Integer, String> stringToMapIntString(String value) {
        Type mapType = new TypeToken<Map<Integer, String>>() {}.getType();
        return new Gson().fromJson(value, mapType);
    }
}
