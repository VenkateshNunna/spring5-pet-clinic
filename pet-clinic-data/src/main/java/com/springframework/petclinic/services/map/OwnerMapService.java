package com.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.PetService;
import com.springframework.petclinic.services.PetTypeService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	private PetTypeService petTypeService;
	private PetService petService;

	public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Owner findByLastName(String lName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner save(Owner object) {
		if(object != null)
		{
			object.getPets().forEach(pet -> {
				if(pet.getPetType()!=null) {
					if(pet.getPetType().getId() == null) {
						pet.setPetType(petTypeService.save(pet.getPetType()));
					}
				}
				else {
					throw new RuntimeException("Pet Type is required");
				}
				if(pet.getId() == null)
				{
					pet.setId(petService.save(pet).getId());
				}
			});
			return super.save(object);
		}
		return null;
		
	}

}
