package com.example.individual.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("hello")
    public String m01(){
        System.out.println("안녕~~~");
        return "test";
    }
}
