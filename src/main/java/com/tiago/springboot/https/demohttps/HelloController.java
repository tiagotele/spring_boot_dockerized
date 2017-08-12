package com.tiago.springboot.https.demohttps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tiago on 16/06/17.
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String greeting() {
        return "Hello world Spring";
    }
}
