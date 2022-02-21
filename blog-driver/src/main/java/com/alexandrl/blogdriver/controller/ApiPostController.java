package com.alexandrl.blogdriver.controller;


import com.alexandrl.blogdriver.model.Post;
import com.alexandrl.blogdriver.service.PostService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
@AllArgsConstructor
@NoArgsConstructor
@Log
public class ApiPostController {

    @Autowired
    PostService postService;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPostMap() {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "count", postService.getPostsCount(),
                "posts", postService.getAllPost()));
    }

    @GetMapping(path = "/search", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPostMapAllParameters(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "recent") String mode) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "count", postService.getPostsCount(),
                "posts", postService.getAllPost()));
    }
}