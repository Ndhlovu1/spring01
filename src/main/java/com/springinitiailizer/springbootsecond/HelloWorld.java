package com.springinitiailizer.springbootsecond;

import org.hibernate.engine.jdbc.Size;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.EnumMap;
import java.util.EnumSet;

@RestController
public class HelloWorld {

    //A basic Http Get Request
    @GetMapping("/greet")
    public String greeting(){


        EnumMap<PizzaSizes, String> pizzaSizesStringEnumMap = new EnumMap<>(PizzaSizes.class);

        for (String item : pizzaSizesStringEnumMap.values()){
            System.out.println(item);
        }


        String obj = pizzaSizesStringEnumMap.entrySet().toString();

        return obj;

    }

    enum PizzaSizes{
        EXTRASMALL,SMALL, MEDIUM, LARGE, EXTRALARGE
    }



}
