package com.crm.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//means pre loaded
public class Config {
    	@Bean//it will create object of this particular class,and keep the details in spring ioc.
	public ModelMapper getMapper(){
	return new ModelMapper();
	}
}
