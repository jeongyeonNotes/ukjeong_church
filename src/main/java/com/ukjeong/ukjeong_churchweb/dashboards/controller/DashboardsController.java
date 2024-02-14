package com.ukjeong.ukjeong_churchweb.dashboards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardsController {

    @RequestMapping(value = "/dashboards/index")
    public String ViewDashboards(){
        System.out.println("move page test ....");
        return "/dashboards/projects";
    }
}
