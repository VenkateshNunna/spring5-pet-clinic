package com.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.Speciality;
import com.springframework.petclinic.services.SpecialityService;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService{

}
