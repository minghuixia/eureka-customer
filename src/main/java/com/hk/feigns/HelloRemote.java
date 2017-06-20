package com.hk.feigns;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaminghui on 2017/6/15 0015.
 */
@FeignClient(name = "eureka-client")
public interface HelloRemote {
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
