package com.CustomizeException;

public class InvalidAadharNumber extends RuntimeException{

	public InvalidAadharNumber(String s)
	{
		super(s);
	}
}
