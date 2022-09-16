package com.muller.microservice.department.controller;

import com.muller.microservice.department.entity.Department;
import com.muller.microservice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("saveDepartment method inside department controller ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentId) {
        log.info("getDepartment method inside department controller ");
        return departmentService.findDepartmentById(departmentId);
    }
}
