package top.wangxingyu.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 笼中雀
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public Object test(){
        return "Hello World!";
    }
}
