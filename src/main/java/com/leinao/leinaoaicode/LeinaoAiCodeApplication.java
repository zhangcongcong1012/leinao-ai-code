package com.leinao.leinaoaicode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class LeinaoAiCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeinaoAiCodeApplication.class, args);
	}

}
