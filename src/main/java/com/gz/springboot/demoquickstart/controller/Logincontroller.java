package com.gz.springboot.demoquickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class Logincontroller {
    @PostMapping("/user/login")
    public String Login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<Object,String> map,HttpSession session){
                    if (!StringUtils.isEmpty(username)&&"123456".equals(password)){
                        session.setAttribute("user", username);
                        return "redirect:/main.html";
                    }else
                    {
                        map.put("msg", "用户名或密码错误!");
                        return "login";
                    }

    }
}
