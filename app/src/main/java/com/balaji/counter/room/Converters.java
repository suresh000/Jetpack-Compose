package com.balaji.counter.room;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Converters {

    @TypeConverter
    public static List<Integer> fromString(String value) {
        Type listType = new TypeToken<List<Integer>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromList(List<Integer> value) {
        if (value == null) {
            return "";
        } else {
            return new Gson().toJson(value);
        }
    }

}
