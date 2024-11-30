package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.serviceImpl.*;

//import java.util.Scanner;
import java.util.*;


public class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Rbi bank = new Sbi();
		
		 while(true)
		 {
		    System.out.println("Enter Choice: ");
		    System.out.println("1.Create Account");
		    System.out.println("2.Deposite Money");
		    System.out.println("3.Withdrawal Money");
		    System.out.println("4.Balance Check");
			int choice = sc.nextInt();
	
			if(choice==1)
			{
				bank.createAccount();
			}
			else if(choice==2)
			{
				bank.depositeMoney();
			}
			else if(choice==3)
			{
				bank.withdrawal();
			}
			else if(choice==4)
			{
				bank.balanceCheck();
			}
			else
			{
				System.out.println("Enter valid choice");
			}
		}
		
		
		
	}
}


