package com.alexandrl.blogdriver.controller;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
@Log
public class ApiAuthController {
    @GetMapping(path = "/check", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCheck() {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "result", false));
    }
}
