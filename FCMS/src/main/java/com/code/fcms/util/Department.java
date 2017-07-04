package com.code.fcms.util;

/**
 * Department of a Hospital
 * @author luucasAlbuq
 *
 */
public enum Department {
	Medical("Medical"),
	Clean("Clean Services"),
	Pharmacy("Pharmacy");
	
	private String name;
	
	private Department(String name){
		this.name = name();
	}
	
	private String getName(){
		return this.name; 
	}
}
