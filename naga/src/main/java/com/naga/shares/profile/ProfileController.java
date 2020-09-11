package com.naga.shares.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	
	@Autowired
	ProfileDao dao;
	@CrossOrigin
	@PostMapping("/register")
	public RegisterPOJO getRegistered(@RequestBody RegisterPOJO pojo)
	{
		return dao.getRegistered(pojo);
	}
	
	
	@CrossOrigin
	@PostMapping("/login")
	public RegisterPOJO loggingIn(@RequestBody RegisterPOJO pojo)
	{
		return dao.loggingIn(pojo);
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get")
	public List getLoggingIn1()
	{
		return dao.getLoggingIn1();
	}
	
	
	@CrossOrigin
	@GetMapping("/get")
	public List getLoggingIn2()
	{
		return dao.getLoggingIn1();
	}
}
