package xyz.up123.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.up123.common.User;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "ershixiong") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/user")
    public User user(@RequestParam(value = "name", defaultValue = "ershixiong") String name) {
        User user = new User();
        user.setId(1);
        user.setName(name + "_" + port);
        user.setAge(30);
        return user;
    }

}
