package com.CustomizeException;



public class InvalidAccountNumberException extends RuntimeException {

	public InvalidAccountNumberException(String s)

	{
		super(s);
	}
}
