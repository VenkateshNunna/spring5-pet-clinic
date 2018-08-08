package com.springframework.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.springframework.petclinic.services.CrudService;

public abstract class AbstractMapService<T,ID> implements CrudService<T,ID> {
	
	Map<ID,T> map = new HashMap<>();

	@Override
	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	@Override
	public T findById(ID id) {
		return map.get(id);
	}

	@Override
	public T save(ID id,T object) {
		map.put(id, object);
		return object;
	}

	@Override
	public void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
		
	}

	@Override
	public void deleteById(ID id) {
		map.remove(id);
		
	}
	
	

}
