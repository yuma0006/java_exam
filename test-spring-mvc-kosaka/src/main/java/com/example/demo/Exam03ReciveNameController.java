package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03ReciveNameController {


    @RequestMapping("")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/fin")
    public String fin(String name){
        System.out.println(name);
        return "finished";
    }
}
