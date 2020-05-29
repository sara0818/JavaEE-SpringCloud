package com.wxr.springcloudconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "springcloud-producer")
public interface HelloProducer {
  @RequestMapping(value = "/api/v1/demo/get")
  public String get();
}
