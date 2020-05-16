package com.project.LoginAuthentication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LoginAuthentication.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
