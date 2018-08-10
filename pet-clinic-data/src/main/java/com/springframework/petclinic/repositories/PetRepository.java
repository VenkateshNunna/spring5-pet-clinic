package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
