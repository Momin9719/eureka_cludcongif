package com.example.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicetwo")
public class hello2 {
@GetMapping("/two")
public String get()
{
return "hello world in service 2";	
}
}
