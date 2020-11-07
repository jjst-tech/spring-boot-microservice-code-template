/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.ws.ui.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.richard.application.ws.ui.model.requests.UserRequestSigup;

/**
 * @author richard
 */
@RestController
@RequestMapping("/ws/users")
public class UserController {
  
  /**
   * Return Type String
   * Test: http://localhost:8080/ws/users/all
   */
  @GetMapping("/all")
  @ResponseBody
  public ResponseEntity<String> getAllUsers() {
    return new ResponseEntity<>("Get all users was called!", HttpStatus.OK);
  }
  
  /**
   * Return Type String
   * Test: http://localhost:8080/ws/users/AFTYASDF
   */
  @GetMapping("/{id}")
  @ResponseBody
  public ResponseEntity<String> getUserById(@PathVariable String id) {
    return new ResponseEntity<>("Get user id: " + id, HttpStatus.OK);
  }
  
  /**
   * Return Type String
   * Test: http://localhost:8080/ws/users?page=1&limit=50&sort=AFTYASDF
   */
  @GetMapping
  @ResponseBody
  public ResponseEntity<String> getUser(@RequestParam(value="page", defaultValue = "1") int page, @RequestParam(value="limit", defaultValue = "1") int limit, @RequestParam(value = "sort", required = true) String sort) {
    return new ResponseEntity<>("Get user with: " + page +" and limit: " +limit +" and sort: " +sort, HttpStatus.OK);
  }
  
  /**
   * Return Type void
   * Test: http://localhost:8080/ws/users/create
   */
  @PostMapping("/create")
  public ResponseEntity<String> createUser(@RequestBody UserRequestSigup userRqCreate) {
    return new ResponseEntity<>("User was created", HttpStatus.OK);
  }
  
}
