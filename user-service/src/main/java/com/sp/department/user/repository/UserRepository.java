package com.sp.department.user.repository;

import com.sp.department.user.entity.UserSdo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*************************************
 * This Class is used to
 * Author  : Shwetank Shukla
 File    : com.sp.department.user.repository.UserRepository
 *
 Date    : 27 August 2022
 * Version : 1.0
 **************************************/
@Repository
public interface UserRepository extends JpaRepository<UserSdo,Long> {
}
