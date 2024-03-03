package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping ("/calculator")

    public String greeting (){
        return "Добро пожаловать в калькулятор";
    }

}
