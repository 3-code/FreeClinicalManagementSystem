package com.code.fcms.dao;

/**
 * Defines the basic crud operations of the system
 * 
 * @author luucasAlbuq
 *
 */
public interface GenericDAO {
	
	public <T> Object create( T object);
	public <T> Object update(T object);
	public <T> boolean delete(T objectId);
	public <T> Object read(T ObjectId);
	
}
