package com.naga.shares.profile;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<RegisterPOJO, String> {

	
	public RegisterPOJO findByUnameAndPsw(String uname,String psw);
}
