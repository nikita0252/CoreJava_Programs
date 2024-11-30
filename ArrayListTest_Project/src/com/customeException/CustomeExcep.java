package com.customeException;

public class CustomeExcep 

{
  public int age;
  public int weight;
  
  public static void main(String[] args) {
	

  
  public void ageandweight()  
  {
	  if(age>=21 && age<=60) 
	  {
		  System.out.println("Your age is Eligible");
		  
		  
	  
		  if(weight>=40 && weight<=70)
		  {
			  System.out.println("Your weight is Eligible");
			  throw new invalidDonar("Invalid age and weight");
		  }
		  else
		  {
			  System.out.println("you are not eligible");
		  }
	  }
	  else
	  {
		  
		  System.out.println("You are not Eligible");
		 
	  }
  }

}}
