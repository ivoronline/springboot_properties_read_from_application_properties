package com.ivoronline.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Value("${message.hello}")
  private String message;

  //================================================================
  // HELLO
  //================================================================
  @RequestMapping("Hello")
  String hello() {
    return message;
  }

}
