package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EcommerceBackendApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EcommerceBackendApplication.class);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}

}


/*
eyJhbGciOiJIUzI1NiJ9.eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWthc2hAZ21haWwuY29tIiwiaWF0IjoxNzcxNjgxNDQ0LCJleHAiOjE3NzE3Njc4NDR9.ZHFUMyz3naWbzP5cjIAP_tY1GVAaZZuim7_kcnCUe5A-3bF3-UpUzRtneuSlILHpTU

eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWthc2gxMjNAZ21haWwuY29tIiwiaWF0IjoxNzcxNjgxNDYzLCJleHAiOjE3NzE3Njc4NjN9.j7KoL7ZEFLHc9zs6ChOCGRs8e-Rn20B5SNAEriFyrMk

*/