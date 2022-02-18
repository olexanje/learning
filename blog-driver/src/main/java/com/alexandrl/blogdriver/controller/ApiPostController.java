package com.alexandrl.blogdriver.controller;


import com.alexandrl.blogdriver.model.Post;
import com.alexandrl.blogdriver.service.PostService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/post")
@AllArgsConstructor
@Log
public class ApiPostController {

    PostService postService;

    @GetMapping(path = "/", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getSettings() {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "count", postService.getPostsCount(),
                "posts", postService.getAllPost()));
    }

    @GetMapping(path = "/posts/", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Post> postList() {
        return postService.findPosts();
    }
}