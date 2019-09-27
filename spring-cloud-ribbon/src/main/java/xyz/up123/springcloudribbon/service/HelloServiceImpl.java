package xyz.up123.springcloudribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：ZhuWenming
 * @CreateTime：2019/9/26 15:31
 * @Description：TODO
 * @Version: V1.0.0
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://spring-cloud-eureka-client/hi?name="+name,String.class);
    }
}
