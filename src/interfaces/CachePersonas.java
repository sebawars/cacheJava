package interfaces;

import classes.Persona;
import exceptions.CacheException;

public interface CachePersonas {
/**
* Busca una persona mediante su identificador interno
* @param id Identificador interno de la persona
* @return la Persona correspondiente al identificador provisto o null si no está en
cache
* @throws CacheException si ocurre algún error
*/
	
	
public Persona getByID(Long id)throws CacheException;
/**
* Busca una persona mediante su número de documento
* @param documentNumber Numero de documento de la persona
* @return la Persona correspondiente al número de documento provisto o null si no
está en cache
* @throws CacheException si ocurre algún error
*/
public Persona getByDocumentNumber(String documentNumber)throws CacheException;
/**
* Busca una persona mediante su número de pasaporte
* @param passportNumber Numero de pasaporte de la persona
* @return la Persona correspondiente al número de pasaporte provisto o null si no
está en cache
* @throws CacheException si ocurre algún error
*/
public Persona getByPassportNumber(String passportNumber)throws CacheException;
/**
* Agrega una persona a la cache
* @param p La persona a agregar
* @throws CacheException si ocurre algún error
*/
public void add(Persona p)throws CacheException;
/**
* Actualiza una persona en la cache<br/>
* Modifica los datos internos de la persona<br/>
* NO MODIFICA Numero de documento, ni Numero de pasaporte, ni identificador interno
* @param p La persona a actualizar
* @throws CacheException si ocurre algún error
*/
public void update(Persona p)throws CacheException;
/**
* Elimina una persona de la cache
* @param p La persona a eliminar
* @return la Persona eliminada o null si no está en cache
* @throws CacheException si ocurre algún error
*/
public Persona remove(Persona p)throws CacheException;
}