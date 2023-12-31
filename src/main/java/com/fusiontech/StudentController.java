package com.fusiontech;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
	
	RestTemplate restTemplate;
	
	@Value("${icici.url}")
	private String url;
	
	public StudentController() {
		System.out.println("inside StudentController const");
		}
	@GetMapping("/getName")
	public String getName() {
		System.out.println("inside getname");
		System.out.println(url);
		return "hello-Developer";
	}
	
	

}
