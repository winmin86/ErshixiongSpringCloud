package xyz.up123.springcloudribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.up123.springcloudribbon.service.HelloService;

/**
 * @Author：ZhuWenming
 * @CreateTime：2019/9/26 15:33
 * @Description：TODO
 * @Version: V1.0.0
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

}
