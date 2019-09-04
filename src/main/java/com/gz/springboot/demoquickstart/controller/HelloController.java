package com.gz.springboot.demoquickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @Value("${msg}")
//    private String msg;
//    @ResponseBody
//    @RequestMapping("hello")
//    public String Hello()
// {
//     return  "lalala"+msg;
// }

    @RequestMapping("/success")
    public String success()
    {
        return "success";
    }

    @RequestMapping({"/zhy","/index.html"})
    public String index()
    {
        return "login";
    }
}
