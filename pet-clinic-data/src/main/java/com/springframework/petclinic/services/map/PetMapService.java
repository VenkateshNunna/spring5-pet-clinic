package com.springframework.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.services.PetService;
import com.springframework.petclinic.services.VisitService;

@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService{

	private VisitService visitService;
	
	public PetMapService(VisitService visitService) {
		super();
		this.visitService = visitService;
	}

	@Override
	public Pet save(Pet object) {
		if(object != null) {
			object.getVisits().forEach(visit -> {
				if(visit != null) {
					if(visit.getId() == null) {
						visitService.save(visit);
					}
				}
			});
			return super.save(object);
		}
		return null;
		
	}

	
	
}
