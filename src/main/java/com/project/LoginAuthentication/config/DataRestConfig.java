package com.project.LoginAuthentication.config;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class DataRestConfig extends RepositoryRestConfigurerAdapter {

private EntityManager entityManager;
	
	
	@Autowired
	public DataRestConfig(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
}

