package com.wxr.springcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringcloudConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudConsumerApplication.class, args);
  }

  @ResponseBody
  @RequestMapping(value = "/api/v1/demo/get")
  public String get(){
    return "Hello sara!";
  }

}
