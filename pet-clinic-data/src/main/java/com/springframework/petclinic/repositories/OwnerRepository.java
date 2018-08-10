package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

}
