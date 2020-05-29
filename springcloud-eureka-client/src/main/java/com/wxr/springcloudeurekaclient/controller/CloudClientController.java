package com.wxr.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CloudClientController {

  @Autowired
  private RestTemplate restTemplate;

  @ResponseBody
  @RequestMapping(value = "/invokeService", method = RequestMethod.GET)
  public String invokeService(@RequestParam(value = "name") String name) {
    System.out.println("入参name:" + name);
    String json = restTemplate.getForObject("http://CLOUD-SERVICE/getServiceNameAndPort?name=" + name, String.class);
    System.out.println(json);
    return json;
  }
}
