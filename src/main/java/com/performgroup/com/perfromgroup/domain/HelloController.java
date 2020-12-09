package com.performgroup.com.perfromgroup.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/siema")
    public String hello() {

        return "Hello World baby";
    }
}
