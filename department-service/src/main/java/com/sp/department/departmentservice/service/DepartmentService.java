package com.sp.department.departmentservice.service;

import com.sp.department.departmentservice.entity.DepartmentSdo;
import com.sp.department.departmentservice.repository.DepartmentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.departmentservice.service.DeparmentService
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@Service
@Log4j2
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public DepartmentSdo save(DepartmentSdo department) {
        log.info("DepartmentService-save");
        return repository.save(department);
    }

    public DepartmentSdo getByID(Long depId) {
        log.info("DepartmentService-save");
        Optional<DepartmentSdo> depOpt =repository.findById(depId);
        if(depOpt.isPresent()){
            return depOpt.get();
        }
        return null;
    }
}
