package com.example.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

@GetMapping("/fallbac")
public String get()
{
	return "current server is down";
	}

}
