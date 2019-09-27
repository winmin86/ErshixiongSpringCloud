package xyz.up123.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author：ZhuWenming
 * @CreateTime：2019/9/27 13:30
 * @Description：TODO
 * @Version: V1.0.0
 */

@Component
public class ConfigUtil {

    @Value("${foo}")
    private String foo;

    @Value("${democonfigclient.message}")
    private String message;

    public String getFoo() {
        return foo;
    }

    public String getMessage() {
        return message;
    }
}
