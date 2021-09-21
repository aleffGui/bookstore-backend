package com.guilherme.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.guilherme.bookstore.service.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
	@Autowired
	private DBService dbService;
	@Bean
	public void instanciaBaseDeDados() {
		dbService.instanciaBaseDeDados();
	}
}
