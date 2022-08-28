package com.sp.cloud.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.cloud.cloudgateway.controller.FallBackController
 *
 Date    : 28 August 2022
 * Version : 1.0
 **************************************/
@RestController
@RequestMapping("/")
public class FallBackController {


    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "User service taking longer than Expected Please try again!";
    }

    @GetMapping("departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod(){
        return "Department service taking longer than Expected Please try again!";
    }
}
