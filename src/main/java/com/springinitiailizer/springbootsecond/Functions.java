package com.springinitiailizer.springbootsecond;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
public class Functions {


    public void drive(){
        System.out.println("Read Leaf UI & Download book from the spring site");
    }



}
