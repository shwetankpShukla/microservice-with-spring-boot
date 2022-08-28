package com.sp.department.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.user.entity.User
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserSdo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userCode;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String emailId;
    private Long depId;
}
