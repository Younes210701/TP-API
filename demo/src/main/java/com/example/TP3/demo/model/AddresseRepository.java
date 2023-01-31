package com.example.TP3.demo.model;

import org.apache.tomcat.jni.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresseRepository extends CrudRepository<Address, Long> {
}

