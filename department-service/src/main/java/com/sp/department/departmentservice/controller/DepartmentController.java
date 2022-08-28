package com.sp.department.departmentservice.controller;

import com.sp.department.departmentservice.entity.DepartmentSdo;
import com.sp.department.departmentservice.service.DepartmentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.departmentservice.controller.DepartmentController
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@RestController
@RequestMapping("departments")
@Log4j2
public class DepartmentController {

    @Autowired
    private DepartmentService service;

@PostMapping("/")
    public DepartmentSdo save (@RequestBody DepartmentSdo department){
    log.info("DepartmentController:save");
        return  service.save(department);
    }

    @GetMapping("/{id}")
    public DepartmentSdo getByID(@PathVariable("id") Long depId){
        return service.getByID(depId);
    }
}
