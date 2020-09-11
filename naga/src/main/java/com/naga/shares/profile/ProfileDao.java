package com.naga.shares.profile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class ProfileDao {
	@Autowired
	ProfileRepository repository;

	public RegisterPOJO getRegistered(RegisterPOJO pojo) {
		
		return repository.save(pojo);
	}

	public RegisterPOJO loggingIn(RegisterPOJO pojo) {
	//	Example<RegisterPOJO> example = new 
		
		//Example<RegisterPOJO> example = Example.of(pojo);
		String uname=pojo.getUname();
		String psw = pojo.getPsw();
		return repository.findByUnameAndPsw(uname, psw);
	}

	public List getLoggingIn1() {
				return repository.findAll();
	}

}
