package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springframework.petclinic.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long>{

	Owner findByLastName(String lName);

}
