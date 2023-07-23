package com.CustomizeException;

public class InvalidMobileNumber extends RuntimeException {

	public InvalidMobileNumber(String s)
	{
		super(s);
	}
}
