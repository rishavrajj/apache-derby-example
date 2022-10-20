package com.javatpoint.apachederbyexample.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.apachederbyexample.Model.UserRecord;

@Repository
public interface UserRepository extends CrudRepository<UserRecord, String> {

}
