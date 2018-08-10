package com.springframework.petclinic.map;

import java.time.LocalDate;
import java.util.HashSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.model.PetType;
import com.springframework.petclinic.model.Speciality;
import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.PetService;
import com.springframework.petclinic.services.PetTypeService;
import com.springframework.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetService petService;
	private final PetTypeService petTypeService;
	

	public DataLoader(OwnerService ownerService, VetService vetService, PetService petService,
			PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
		this.petTypeService = petTypeService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Owner1 First Name");
		owner1.setLastName("Owner1 Last Name");
		owner1.setAddress("owner1 address");
		owner1.setCity("owner1 city");
		owner1.setTelephone("1243598374");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Owner2 First Name");
		owner2.setLastName("Owner2 Last Name");
		owner2.setAddress("owner2 address");
		owner2.setCity("owner2 city");
		owner2.setTelephone("3535345656");
		ownerService.save( owner2);
		
		System.out.println("Loaded Owners....");
		
		Speciality speciality1 = new Speciality();
		speciality1.setDescription("Speciality1 Descriptionj");
		
		Speciality speciality2 = new Speciality();
		speciality2.setDescription("Speciality3 Descriptionj");
		
		Speciality speciality3 = new Speciality();
		speciality3.setDescription("Speciality3 Descriptionj");
		
		
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Vet1 First Name");
		vet1.setLastName("Vet1 Last Name");
		vet1.getSpecialities().add(speciality1);
		vet1.getSpecialities().add(speciality2);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Vet2 First Name");
		vet2.setLastName("Vet2 Last Name");
		vet2.getSpecialities().add(speciality1);
		vet2.getSpecialities().add(speciality3);
		vetService.save(vet2);
		
		System.out.println("Loaded Vets....");
		
		PetType petType1 = new PetType();
		petType1.setName("pet Type1");
		petTypeService.save(petType1);
		
		PetType petType2 = new PetType();
		petType2.setName("Pet Type2");
		petTypeService.save(petType2);
		
		Pet pet1 = new Pet();
		pet1.setPetType(petType1);
		pet1.setOwner(owner1);
		pet1.setBirthDate(LocalDate.now());
		pet1.setName("Pet1");
		
		Pet pet2 = new Pet();
		pet2.setPetType(petType2);
		pet2.setOwner(owner1);
		pet2.setBirthDate(LocalDate.now());
		pet2.setName("Pet2");
		
		owner1.getPets().add(pet1);
		owner1.getPets().add(pet2);
		
		Pet pet3 = new Pet();
		pet3.setPetType(petType2);
		pet3.setOwner(owner2);
		pet3.setBirthDate(LocalDate.now());
		pet3.setName("Pet3");
		
		owner2.getPets().add(pet3);
		
		
	}

}
