package com.springinitiailizer.springbootsecond;

import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Todo : SOAP UI
@RestController
//The rest controller says we want to write straight into the response body
public class HomeController {

    @GetMapping("/home")
    //The GetMapping is Spring's shorthand for @RequestMapping(method=RequestMethod.GET)
    public String greeting(@RequestParam(required = false,defaultValue = "") String name){

        return name.equals("") ? "Welcome!" : "Hey, " + name+"!";

    }



}
