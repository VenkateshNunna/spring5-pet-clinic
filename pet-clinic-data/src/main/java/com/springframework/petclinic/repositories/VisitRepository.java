package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long>{

}
