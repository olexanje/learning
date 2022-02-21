package com.alexandrl.blogdriver.controller;

import java.util.ArrayList;
import java.util.Map;

import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Default controller
 */
@Controller
@RequestMapping("/")
@Log
public class DefaultController {

  @GetMapping
  public String getIndex() {
    log.info("Handling get index page");
    return "index";
  }

  @GetMapping("404")
  public String getIndexFrom404() {
    log.info("Handling get index page from 404ERROR");
    return "index";
  }

  /**
   * Default init settings
   */
  @GetMapping(path = "api/init", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> getInit() {
    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
        "title", "FrogPub",
        "subtitle", "Весёлые истории",
        "phone", "+7 961 531-18-93",
        "email", "alexandr.luzyanin@gmail.com",
        "copyright", "Лузянин Александр",
        "copyrightFrom", "2021"));
  }

  /**
   * Default global settings
   */
  @GetMapping(path = "api/settings", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> getSettings() {
    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
        "MULTIUSER_MODE", false,
        "POST_PREMODERATION", false,
        "STATISTICS_IS_PUBLIC", false));
  }

  @GetMapping(path = "api/tag", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> getTags() {
    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
        "tags", new ArrayList()));
  }

}
