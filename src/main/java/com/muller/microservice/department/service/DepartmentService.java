package com.muller.microservice.department.service;

import com.muller.microservice.department.entity.Department;
import com.muller.microservice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("saveDepartment method inside department service ");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("findDepartmentById method inside department service ");
        return departmentRepository.findByDepartmentId(departmentId);

    }
}
