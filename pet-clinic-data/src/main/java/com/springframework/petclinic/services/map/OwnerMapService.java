package com.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.services.OwnerService;
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner findByLastName(String lName) {
		// TODO Auto-generated method stub
		return null;
	}

}
