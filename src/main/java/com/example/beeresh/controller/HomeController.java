package com.example.beeresh.controller;


import com.example.beeresh.beans.UserBean;
import com.example.beeresh.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    UserService  service;

    public HomeController() {
    }

     @RequestMapping("sayHello")
    public String sayHello()
    {
        return "dassss";
    }


    @PostMapping("addUser")
    public UserBean addUser(@RequestBody UserBean bean)
    {

        System.out.println(bean);
        bean=service.save(bean);
        return bean;

    }

    @GetMapping("allUsers")
    public List<UserBean> getAllUser()
    {
        List l=service.findAll();
        return l;
    }

}
