package com.example.test_spring_scope_kosaka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;

    @ModelAttribute
    public Exam02Form exam02Form(){
        return new Exam02Form();
    }

    @RequestMapping("")
    public String index(){
        return "exam02";
    }

    @RequestMapping("/input")
    public String input(Exam02Form exam02Form){

        session.getAttribute(exam02Form.getNum1());
        session.getAttribute(exam02Form.getNum2());
        
        return "exam02-result";
    }

    @RequestMapping("/output")
    public String output(){
        return "exam02-result2";
    }


}
