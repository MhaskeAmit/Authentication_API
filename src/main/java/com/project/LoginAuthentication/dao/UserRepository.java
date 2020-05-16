package com.project.LoginAuthentication.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.project.LoginAuthentication.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long> {

	UserInfo findByUsername(@Param("username") String username);

	
}
