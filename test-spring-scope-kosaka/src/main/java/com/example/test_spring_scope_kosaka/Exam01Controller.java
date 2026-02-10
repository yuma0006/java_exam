package com.example.test_spring_scope_kosaka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @ModelAttribute
    public Exam01Form setUpExam01Form(){
        return new Exam01Form();
    }

    @RequestMapping("")
    public String index(){
        return "ex01";
    }

    @RequestMapping("/recive-info")
    public String reciveInfo(Exam01Form exam01Form,Model model){
        if ("yamada@sample.com".equals(exam01Form.getMail()) && "yamayama".equals(exam01Form.getPassword())) {
            model.addAttribute("result","成功");
        }else{
            model.addAttribute("result","失敗");
        }return "ex01-result";
    }

}
