package com.gz.springboot.demoquickstart.controller;

import com.gz.springboot.demoquickstart.dao.EmployeeDao;
import com.gz.springboot.demoquickstart.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class employeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("emps")
    public  String List(Model model)
    {
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("employee", all);
        return "emps/list";
    }
    @GetMapping("emp")
    public  String add(){
        return "emps/add";
    }
}
