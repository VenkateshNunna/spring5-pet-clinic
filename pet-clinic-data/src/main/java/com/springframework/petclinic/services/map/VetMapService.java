package com.springframework.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.SpecialityService;
import com.springframework.petclinic.services.VetService;

@Service
@Profile({"default","map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

	private SpecialityService specialityService;
	
	
	public VetMapService(SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}


	@Override
	public Vet save(Vet object) {
		if(object != null) {
			object.getSpecialities().forEach(speciality -> {
				if(speciality != null) {
					if(speciality.getId() == null) {
						speciality.setId(specialityService.save(speciality).getId());
					}
						
				}else {
					throw new RuntimeException("Speciality is required");
				}
			});
			return super.save(object);
		}
		return null;
		
	}

	
	
}
