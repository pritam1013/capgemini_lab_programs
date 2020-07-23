package com.capg.name;

public class Controller {
public void  controls(String first,String last)throws NameException
{
	if(first.isEmpty())
	{
		throw new NameException("first name is empty or enter first name properly");
	}
	else if(last.isEmpty())
	{
		throw new NameException("last name is empty or enter first name properly");

	}
	else 
	{
		System.out.println("full name is"+first+last);
	}

}
}
