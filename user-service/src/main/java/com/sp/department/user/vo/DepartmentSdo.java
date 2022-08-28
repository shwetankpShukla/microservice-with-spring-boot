package com.sp.department.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.departmentservice.entity.DepartmentEntity
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentSdo {


    private Long depId;
    private String depName;
    private String depAddress;
    private String depCode;
}
