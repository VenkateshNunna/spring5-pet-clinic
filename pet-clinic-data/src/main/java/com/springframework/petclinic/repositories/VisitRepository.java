package com.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springframework.petclinic.model.Visit;
@Repository
public interface VisitRepository extends CrudRepository<Visit, Long>{

}
