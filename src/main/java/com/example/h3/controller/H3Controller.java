package com.example.h3.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class H3Controller {

    @GetMapping("/h3")
    public String getH3Index(@RequestParam double latitude, @RequestParam double longitude) throws IOException {
        // Get the H3 index for the given latitude and longitude.
        String h3Index = H3Utils.getH3Index(latitude, longitude);

        // Return the H3 index as a JSON response.
        return "{ \"h3Index\": \"" + h3Index + "\"}";
    }

   
}
