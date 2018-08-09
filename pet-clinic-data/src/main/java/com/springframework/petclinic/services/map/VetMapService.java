package com.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.VetService;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

}
