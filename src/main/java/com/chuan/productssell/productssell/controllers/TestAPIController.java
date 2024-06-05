package com.chuan.productssell.productssell.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class TestAPIController {

    @GetMapping("/api/current-time")
    public ResponseEntity<?> getCurrentTime(){
        return ResponseEntity.ok(LocalTime.now());
    }
}
