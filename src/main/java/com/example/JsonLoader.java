package com.example;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class JsonLoader {
    public String getJsonFromResources(String filename) {
        String result = "";

        try {
            result = IOUtils.toString(getClass().getClassLoader().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
