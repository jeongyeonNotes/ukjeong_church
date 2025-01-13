package com.ukjeong.ukjeong_churchweb.dashboards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finance")
public class DashboardsController {
    /* app-재정관리-메인 */
    @RequestMapping(value = "/index")
    public String ViewDashboards(){
        System.out.println("move page test ....");
        return "finance/financeIndex";
    }
    /* app-재정관리-수입/지출 */
    @RequestMapping(value = "/addingAccount")
    public String ViewAddingAccount(){
        System.out.println("move page test ....");
        return "finance/addingAccount";
    }

}
