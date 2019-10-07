package xyz.up123.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：ZhuWenming
 * @CreateTime：2019/9/27 15:45
 * @Description：TODO
 * @Version: V1.0.0
 */
@RestController
@RefreshScope
public class RefreshController {

    @Autowired
    ConfigUtil configUtil;

    @RequestMapping(value = "/hi")
    public String hi(){

        return configUtil.getFoo() + "," + configUtil.getMessage();
    }
}
