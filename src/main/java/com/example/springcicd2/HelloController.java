package com.example.springcicd2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingw
 * @created 10/30/2021 11:01 PM
 * @project springcicd2
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String greetings(){
        return "greetings";
    }
}
