package com.ukjeong.ukjeong_churchweb.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Index(){
        System.out.println("test index home page.... ");
        return "index";
    }
}