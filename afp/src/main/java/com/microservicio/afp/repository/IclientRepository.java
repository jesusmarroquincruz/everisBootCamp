package com.microservicio.afp.repository;

import com.microservicio.afp.modelo.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IclientRepository extends MongoRepository<Client, String>{
}
