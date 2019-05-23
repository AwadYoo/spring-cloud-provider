package com.jet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author awad_yoo
 * @create 2019-05-23 11:39
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello" + name;
    }

}
