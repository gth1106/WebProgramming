package com.example.springtest.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/test")
    public  String[] hello(){
        return new String[] {"Hello World"};
    }
}
