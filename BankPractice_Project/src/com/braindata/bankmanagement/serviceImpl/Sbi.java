package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.service.*;
import java.util.Scanner;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.model.*;

public class Sbi implements Rbi {
	
	Scanner sc = new Scanner(System.in);
	Account a = new Account();
	
	public void createAccount()
	{
		while(true)
		{
			System.out.println("Enter Account No: ");
			
	        long no=sc.nextLong();
	        long no1=no;
			int count=0;
			while(no1>0)
			{
	            no1=no1/10;
				count++;
				
			}
			    if(count==12)
			    {
			    	a.setAccno(no);
			    	System.out.println("valid");
			    	break;
				
			    }
			    else 
			    {
				System.out.println("Enter 12 digit no");
			    }
			
		}
	
		System.out.println("Enter Name: ");
		a.setName(sc.next());
		
		while(true) 
		{
			System.out.println("Enter Mobile No: ");
			String str=sc.next();
			int no=str.length();
			if(no==10)
			{
				a.setMobno(str);
				break;
			}
			else
			{
				System.out.println("Enter Valid no");
			}
		}
		
		
		while(true)
		{
			System.out.println("Enter Adhar No: ");
			String s = sc.next();
			int no=s.length();
			if(no==12)
			{
				a.setAdharno(s);
				break;
			}
			else
			{
				System.out.println("Enter Valid Aadhar No");
			}
		}
		
		
		while(true)
		{
			System.out.println("Gender: ");
			String s1 = sc.next();
			if(s1=="male")
			{
				a.setGender(s1);
				break;
			}
			else
			{
				System.out.println("Enter Valid Gender");
			}
		}
		
		while(true)
		{
			System.out.println("Age: ");
			int s = sc.nextInt();
			if(s<=18 && s>70)
			{
				a.setAge(s);
				break;
			}
			else
			{
				System.out.println("Enter Valid Gender");
			}
		}
		 
		
		System.out.println("Balance: ");
		a.setBalance(sc.nextDouble());
		 
	}

	
	
	
	public void displayAllDetails()
	{

		System.out.println("Account No: "+a.getAccno());
		System.out.println("Name: "+a.getName());
		System.out.println("Mobile No: "+a.getMobno());
		System.out.println("Adhar No: "+a.getAdharno());
		System.out.println("Gender: "+a.getGender());
	    System.out.println("Age: "+a.getGender());
	    System.out.println("Balance: "+a.getBalance());
	}
	
	public void depositeMoney()
	{
		System.out.println("How much do you want Deposite: ");
	    double deposite = sc.nextDouble();
	    a.setBalance((a.getBalance()+deposite));
	    System.out.println("Total Balance :"+a.getBalance());
	    System.out.println("A/c " +a.getAccno()+" credited for Rs: "+deposite);
	      
    }


	@Override
	public void withdrawal()
	{
		System.out.println("How much do you want withdrawal: ");
		double withdrawal= sc.nextDouble();;
		a.setBalance((a.getBalance()-withdrawal));
		System.out.println("Total Balance :"+a.getBalance());
		System.out.println("A/c " +a.getAccno()+" Debited for Rs: "+withdrawal);
		
	}


	@Override
	public void balanceCheck() {
		a.setBalance(a.getBalance());
	    System.out.println("Balance Check: "+a.getBalance());
	    
		
	}
	
}