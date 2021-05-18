package test02;

public class SavingsAccount extends BankAccount{
	private double interestRate; //이자율

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	void updateBalance(int period) { //저축기간
		balance += (double)balance * interestRate * (double)period;
	}
	
	
	
}
