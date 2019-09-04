package com.gz.springboot.demoquickstart.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MylocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest Request) {
        String i = Request.getParameter("L");
        Locale locale =Locale.getDefault();
        if(!StringUtils.isEmpty(i))
        {
         String[] spilt= i.split("_");
         locale =new Locale(spilt[0],spilt[1]);
        }
        return  locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
