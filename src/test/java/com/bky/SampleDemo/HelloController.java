package com.bky.SampleDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity helloWorld(){
        String hello = "Hello World";
        return ResponseEntity.ok(hello);
    }
}
