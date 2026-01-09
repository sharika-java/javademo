package com.sample.SampleMaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mybeanconfig {
	@Bean
	public SpringCls_B classBObj() {
		return new SpringCls_B();
	}
	
    @Bean
	public SpringCls_A classAObj() {
		return new SpringCls_A(this.classBObj());
	}
	
    /*@Bean
	public SpringCls_A classAObject() {
    	SpringCls_A obj = new SpringCls_A();
    	obj.setObj(this.classBObj());
    	return obj;
		
	}*/
	
	
	
}
