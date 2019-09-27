package xyz.up123.springcloudfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.up123.common.User;

/**
 * @Author：ZhuWenming
 * @CreateTime：2019/9/26 15:30
 * @Description：TODO
 * @Version: V1.0.0
 */
@FeignClient(value = "SPRING-CLOUD-EUREKA-CLIENT")
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    User getUser(@RequestParam(value = "name") String name);

}
