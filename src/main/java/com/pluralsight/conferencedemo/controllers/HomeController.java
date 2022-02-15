package com.pluralsight.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
@RestController
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    @RequestMapping("/")
    public Map getStatus() {
        Map<String, String> map = new HashMap<>();
        map.put("app-version", appVersion);
        return map;
    }
}
