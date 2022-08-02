package com.microservicio.afp.repository;
import org.springframework.data.repository.CrudRepository;

import com.microservicio.afp.modelo.Client;

public interface IclienteRepositoryCrud extends CrudRepository<Client, String>{
}
