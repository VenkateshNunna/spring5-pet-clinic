package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springframework.petclinic.model.Speciality;
@Repository
public interface SpecialityRepository extends CrudRepository<Speciality, Long>{

}
