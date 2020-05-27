package com.wxr.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
public class SpringcloudEurekaClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
  }

  @Bean
  @LoadBalanced
  RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

}
