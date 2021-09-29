package com.example.service1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceone")
@RefreshScope
public class hello1 {
    @Value("${message}")
	String msg;
	@GetMapping("/one")
	public String get()
	{
		return msg;
	}
	@GetMapping("/details")
	public List<Entity> getd()
	{
		return get_details();
	}
	public static List<Entity> get_details()
	{
		List<Entity> l=Arrays.asList(new Entity(1, "momin", "fd6qw6"),new Entity(2, "momin", "212fd6qw6"),new Entity(3, "momin", "1fd6qw6"));
		
		return l;
	}
}
