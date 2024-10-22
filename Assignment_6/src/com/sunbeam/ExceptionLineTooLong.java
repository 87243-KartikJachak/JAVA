package com.sunbeam;

public class ExceptionLineTooLong extends RuntimeException
{
	public ExceptionLineTooLong()	{		
	}
	
	public ExceptionLineTooLong(String message)	
	{
		super(message);
	}
	
}
