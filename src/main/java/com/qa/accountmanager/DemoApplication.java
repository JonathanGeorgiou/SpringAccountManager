package com.qa.accountmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		PrizeDraw test = new PrizeDraw();

		String arg = "c8088111111";

		int myTest = test.draw(arg);
		System.out.println(myTest);


	}
	

}
