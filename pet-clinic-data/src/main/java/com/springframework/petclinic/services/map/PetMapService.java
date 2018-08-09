package com.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.services.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService{

}
