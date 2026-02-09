package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ex04")
public class Exam04ReceiveNameController {


    @ModelAttribute
    public ReceiveNameForm setUpForm(){
        return new ReceiveNameForm();
    }

    @RequestMapping("/")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/fin")
    public String fin(ReceiveNameForm receiveNameForm){
        System.out.println(receiveNameForm.getName());
        return "finished";
    }
}
