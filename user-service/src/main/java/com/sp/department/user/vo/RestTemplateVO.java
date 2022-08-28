package com.sp.department.user.vo;

import com.sp.department.user.entity.UserSdo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.user.vo.RestTemplateVO
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestTemplateVO {
    private UserSdo userSdo;
    private DepartmentSdo departmentSdo;
}
