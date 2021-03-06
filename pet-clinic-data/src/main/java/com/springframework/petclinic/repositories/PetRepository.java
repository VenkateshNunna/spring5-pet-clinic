package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springframework.petclinic.model.Pet;
@Repository
public interface PetRepository extends CrudRepository<Pet, Long>{

}
