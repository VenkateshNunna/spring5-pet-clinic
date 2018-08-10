package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long>{

}
