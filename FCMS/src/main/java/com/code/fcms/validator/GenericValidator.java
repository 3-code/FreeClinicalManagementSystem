package com.code.fcms.validator;

/**
 * Defines the basics validations
 * 
 * @author luucasAlbuq
 *
 */
public interface GenericValidator {
	

	/***
	 * Checks if an object is valid for a create operation
	 * @param object
	 * @throws Exception
	 */
	public <T> void isValidForCreate(T object) throws Exception;
	
	/***
	 * Checks if an object is valid for an update operation
	 * @param object
	 * @throws Exception
	 */
	public <T> void isValidForUpdate(T object) throws Exception;
	
	/**
	 * Checks if an object is valid for a delete operation
	 * @param object
	 * @throws Exception
	 */
	public <T> void isValidForDelete(T object) throws Exception;
	
	/**
	 * Checks if an object is valid
	 * @param object
	 * @throws Exception
	 */
	public <T> void isValidObject(T object) throws Exception;
}
