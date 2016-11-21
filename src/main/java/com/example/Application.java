package com.example;

import org.apache.commons.collections4.MapUtils;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        // Loader
        JsonLoader jsonLoader = new JsonLoader();

        // Decoding some examples
        HashMap<String, ?> result1 = new JsonDecoder().decode(jsonLoader.getJsonFromResources("example1.json"));
        HashMap<String, ?>  result2 = new JsonDecoder().decode(jsonLoader.getJsonFromResources("example2.json"));
        HashMap<String, ?>  result3 = new JsonDecoder().decode(jsonLoader.getJsonFromResources("example3.json"));

        // Displaying them
        MapUtils.debugPrint(System.out, "0", result1);
        System.out.println("-----------------------");
        MapUtils.debugPrint(System.out, "0", result2);
        System.out.println("-----------------------");
        MapUtils.debugPrint(System.out, "0", result3);
    }
}
