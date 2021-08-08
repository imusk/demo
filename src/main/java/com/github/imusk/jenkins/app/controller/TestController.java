package com.github.imusk.jenkins.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-08-08 16:55
 * @classname: TestController
 * @description: TODO
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/a")
    public Object a() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("data", "Hello A.");
        return map;
    }


}
