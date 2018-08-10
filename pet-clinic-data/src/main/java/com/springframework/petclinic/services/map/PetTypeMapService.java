package com.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.PetType;
import com.springframework.petclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

}
