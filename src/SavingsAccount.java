/**
 * @author zakgl - zglawless
 * CIS175 - Fall 2021
 * Sep 7, 2022
 */
// Savings Account Pojo
public class SavingsAccount {
	double balance;
	double deposit;
	double withdraw;
	
	
	
	public SavingsAccount() { // no arg constructor

	}

	public SavingsAccount(double balance, double deposit, double withdraw) { // constructor with fields
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	public double getBalance() { // getters and setters
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}	

}
