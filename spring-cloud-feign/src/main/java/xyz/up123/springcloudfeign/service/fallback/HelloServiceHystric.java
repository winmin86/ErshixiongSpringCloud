package xyz.up123.springcloudfeign.service.fallback;

import org.springframework.stereotype.Component;
import xyz.up123.common.User;
import xyz.up123.springcloudfeign.service.HelloService;

/**
 * @Author：ZhuWenming
 * @CreateTime：2019/9/27 10:10
 * @Description：TODO
 * @Version: V1.0.0
 */

@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

    @Override
    public User getUser(String name) {
        User user = new User();
        user.setName("sorry "+name);
        return user;
    }
}
