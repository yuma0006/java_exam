package com.example.test_spring_thymeleaf_kosaka.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_kosaka.domain.Member;
import com.example.test_spring_thymeleaf_kosaka.form.Ex02From;

@Controller
@RequestMapping("/ex01")
public class ExamThymeleafController {

    @ModelAttribute
    public Ex02From setUp(){
        return new Ex02From();
    }

    @RequestMapping("")
    public String index(){
        return "ex-thymeleaf-input";
    }

    @RequestMapping("input")
    public String input(Ex02From form,Model model){
        Member member = new Member();
        member.setName(form.getName());
        member.setAge(form.getIntAge());
        member.setHobby1(form.getHobby1());
        member.setHobby2(form.getHobby2());
        member.setHobby3(form.getHobby3());
        model.addAttribute("member",member);
        return "ex-thymeleaf-result";
    }
}
