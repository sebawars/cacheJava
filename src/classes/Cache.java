package classes;

import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;

import exceptions.CacheException;
import interfaces.CachePersonas;

public class Cache implements CachePersonas{

	private static ArrayList<Persona> personas;
	private static Cache cache;
	
	private Cache(){
		personas = new ArrayList<Persona>();
	}
	
	public Cache getCache(){
		
		if(cache == null){
			cache = new Cache();
		}
		
		return cache;
	}

	@Override
	public Persona getByID(Long id) throws CacheException {

		Optional<Persona> personaBuscada = personas.stream().filter(anyPerson -> anyPerson.getId().equals(id) ).findFirst();
		
		return personaBuscada.get();
		
	}

	@Override
	public Persona getByDocumentNumber(String documentNumber) throws CacheException {

		Optional<Persona> personaBuscada = personas.stream().filter(anyPerson -> anyPerson.getDocumento().equals(documentNumber) ).findFirst();
		
		return personaBuscada.get();
		
	}

	@Override
	public Persona getByPassportNumber(String passportNumber) throws CacheException {

		Optional<Persona> personaBuscada = personas.stream().filter(anyPerson -> anyPerson.getPasaporte().equals(passportNumber) ).findFirst();
		
		return personaBuscada.get();
		
	}

	@Override
	public void add(Persona p) throws CacheException {
		
		personas.add(p);
		
	}

	@Override
	public void update(Persona p) throws CacheException {

		Persona personaBuscada = getByID(p.getId());
		
		if( personaBuscada != null ){
		
			personas.set(personas.indexOf(personaBuscada), p);
			
		}
		
	}

	@Override
	public Persona remove(Persona p) throws CacheException {

		Persona personaBuscada = getByID(p.getId());

		if( personaBuscada != null ){
		
			personas.remove(personaBuscada);
			
		}
		
		return p;
		
	}
	
	
	
}
