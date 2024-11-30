package com.braindata.bankmanagement.serviceImpl;
import java.util.Scanner;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.model.*;

public class Sbi implements Rbi {
	
	Scanner sc = new Scanner(System.in);
	Account a = new Account();
	
	public void createAccount()
	{
		
		System.out.println("Enter Account No: ");
		a.setAccno(sc.nextLong());
		System.out.println("Enter Name: ");
		a.setName(sc.next());
		System.out.println("Enter Mobile No: ");
		a.setMobno(sc.next());
		System.out.println("Enter Adhar No: ");
		a.setAdharno(sc.next());
		System.out.println("Gender: ");
		a.setGender(sc.next());
		System.out.println("Age: ");
		a.setAge(sc.nextInt());
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