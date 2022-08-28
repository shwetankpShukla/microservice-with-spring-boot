package com.sp.department.user.controller;

import com.sp.department.user.entity.UserSdo;
import com.sp.department.user.service.UserService;
import com.sp.department.user.vo.DepartmentSdo;
import com.sp.department.user.vo.RestTemplateVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.user.controller.UserController
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@RestController
@RequestMapping("users")
@Log4j2
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/")
    public UserSdo save(@RequestBody UserSdo user){
        log.info("UserController::save");
        return  service.save(user);
    }

    @GetMapping("/{id}")
    public RestTemplateVO getById(@PathVariable("id") Long userId){
        log.info("UserController::getById");
        RestTemplateVO vo = new RestTemplateVO();
        vo.setUserSdo(service.getById(userId));

        vo.setDepartmentSdo(restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+vo.getUserSdo().getDepId(), DepartmentSdo.class));

        return  vo;
    }

}
