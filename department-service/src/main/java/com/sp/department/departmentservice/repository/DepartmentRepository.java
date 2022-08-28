package com.sp.department.departmentservice.repository;

import com.sp.department.departmentservice.entity.DepartmentSdo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.departmentservice.repository.DepartmentRepository
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentSdo,Long> {
}
