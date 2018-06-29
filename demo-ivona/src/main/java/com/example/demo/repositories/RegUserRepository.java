package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.example.demo.models.RegUser;

public interface RegUserRepository extends CrudRepository<RegUser, Long>  {

	RegUser findFirstByMailAndPassword(String mail,String password);
	RegUser findById(@Param("id") long id);

}
