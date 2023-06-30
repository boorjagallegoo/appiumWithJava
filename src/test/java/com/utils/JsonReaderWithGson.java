package com.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;


public class JsonReaderWithGson {

    private static final String LANGUAGE = System.getProperty("language", "EN");

    public static final String JSON_FILE_PATH = "../app/src/test/resources/properties/";

    public static final String KEYS_JSON_FILE_PATH = System.getProperty("jsonPath", JSON_FILE_PATH + String.format("sauceDemo_keys_%s.json", LANGUAGE));

    public static JsonObject readJsonFile(String filePath) {
        try {
            JsonParser parser = new JsonParser();

            JsonElement jsonElement = parser.parse(new FileReader(filePath));

            return jsonElement.getAsJsonObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getStringValue(String key) {
        String[] keys = key.split("\\.");
        return  readJsonFile(KEYS_JSON_FILE_PATH).getAsJsonObject(keys[0]).get(keys[1]).getAsString();
    }

    public static Boolean getBooleanValue(String key) {
        String[] keys = key.split("\\.");
        return  readJsonFile(KEYS_JSON_FILE_PATH).getAsJsonObject(keys[0]).get(keys[1]).getAsBoolean();
    }

    public static int getStringValue(String object,String key) {
        String[] keys = key.split("\\.");
        return  readJsonFile(KEYS_JSON_FILE_PATH).getAsJsonObject(keys[0]).get(keys[1]).getAsInt();
    }

}
