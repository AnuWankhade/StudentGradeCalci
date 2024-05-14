package com.service;

import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BankAccount bankAccount=new BankAccount(50000);
		do {
			
		System.out.println("Enter your Choice:");
		System.out.println("1.Withdraw Amount\n2.Deposit Amout\n3.Check Balance\n4.Exit");
		int choice=sc.nextInt();
		
	    switch(choice) {
		
		case 1: System.out.println("Enter Amount to Withdraw"); 
		        double Amount=sc.nextDouble();
			    bankAccount.WithdrawAmount(Amount);
			    break;
            
		case 2:System.out.println("Enter Amount to Deposit"); 
                 double Amount1=sc.nextDouble();
	             bankAccount.DepositAmout(Amount1);
	             break;
	    
		case 3: System.out.println("Your Account Balance is " +bankAccount.CheckBalance());
		break;
		
		case 4: System.out.println("Exited");
		return;
		
	    
	            
		}
		
		}while(true);
	
}
}
