package com.example.individual.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("abc")
    public void m01(){
        System.out.println("m01 called ~~~~~~~");
    }
}
