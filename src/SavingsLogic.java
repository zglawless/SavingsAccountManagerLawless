/**
 * @author zakgl - zglawless
 * CIS175 - Fall 2021
 * Sep 7, 2022
 */

// Class with the functions

public class SavingsLogic {
	
	public double viewBalance(SavingsAccount savings) { // returns the balance
		return savings.getBalance();
	}
	
	public double depositMoney(SavingsAccount savings) { // calculates the new balance and returns it
		double balance = savings.getBalance();
		double deposit = savings.getDeposit();
		
		balance = balance + deposit;
		savings.setBalance(balance);

		return balance;
	}
	
	public double withdrawMoney(SavingsAccount savings) { // calculates the new balance and returns it
		double balance = savings.getBalance();
		double withdraw = savings.getWithdraw();
		
		balance = balance - withdraw;
		savings.setBalance(balance);
		
		return balance;
		
	}

}
