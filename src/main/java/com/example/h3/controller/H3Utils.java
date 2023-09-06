package com.example.h3.controller;

import java.io.IOException;

import com.uber.h3core.H3Core;

public class H3Utils {

    public static String getH3Index(double latitude, double longitude) throws IOException {
        // Create an object of the H3Core class.
        H3Core h3 = H3Core.newInstance();

        // Get the H3 index for the given latitude and longitude.
        Long h3Index = h3.geoToH3(latitude, longitude, 10);

        // Convert the H3 index to a string.
        String h3IndexStr = String.format("%09d", h3Index);

        return h3IndexStr;
    }

}

