package com.sp.department.user.service;

import com.sp.department.user.entity.UserSdo;
import com.sp.department.user.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.user.service.UserService
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@Service
@Log4j2
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserSdo save(UserSdo user) {
        log.info("UserController::save");
        return repository.save(user);
    }


    public UserSdo getById(Long userId) {
        log.info("UserController::getById");
        Optional<UserSdo> userOPt=repository.findById(userId);
        if(userOPt.isPresent()){
            return userOPt.get();
        }
        return null;
    }
}
