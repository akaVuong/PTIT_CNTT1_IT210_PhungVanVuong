package org.example.ss03.controller;

import org.example.ss03.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String employees(Model model){
        List<Employee> employeeList = Arrays.asList(
                new Employee(100000, "nhân viên", "Phung Van Vuong", 1),
                new Employee(200000, "nhân viên", "Le Tien Duc", 2)
        );
        model.addAllAttributes( employeeList);
        return "employee-list";
    }
}


