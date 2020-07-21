package com.johnein.herokuboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HerokuBootUpController {
    @GetMapping
    public String bootUp(){
        return "Its working";
    }
}
