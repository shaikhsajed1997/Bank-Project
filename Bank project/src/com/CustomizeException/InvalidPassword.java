package com.CustomizeException;

public class InvalidPassword extends RuntimeException{
	
	public InvalidPassword(String s)
	{
		super(s);
	}

}
