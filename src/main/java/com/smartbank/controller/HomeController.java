package com.smartbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String home()
    {
        return "index";
    }

    @GetMapping("/about")
    public String about()
    {
        return "about";
    }
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @GetMapping("/signup")
    public String sum()
    {
        return "signup";
    }

    @GetMapping("/addAccount")
    public String addAccount()
    {
        return "addAccount";
    }

    @GetMapping("/balance")
    public String balance()
    {
        return "checkBalance";
    }

    @GetMapping("/deposit")
    public String deposit()
    {
        return "deposit";
    }

    @GetMapping("/withdraw")
    public String withdraw()
    {
        return "withdraw";
    }

    @GetMapping("/transaction")
    public String transaction()
    {
        return "transaction";
    }

    @GetMapping("/balanceResult")
    public String balanceResult()
        {
            return "balanceResult";
        }

    @GetMapping("/checkBalance")
    public String check()
        {
            return "checkBalance";
        }

    @GetMapping("/dashboard")
    public String dashboard()
        {
            return "dashboard";
        }

    @GetMapping("/creditSuccess")
    public String credit()
    {
        return "creditSuccess";
    }


}
