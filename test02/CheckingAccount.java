package test02;

public class CheckingAccount extends BankAccount{
	private SavingsAccount protectedBy; //객체 선언
	
	CheckingAccount(int balance) { // 잔액초기화
		super(balance);
	}
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	public boolean withdraw(int amount) { //인출금
		if (amount > balance) {
			protectedBy.balance = protectedBy.balance + balance - amount;
			balance = 0;
			return true;
		} else {
			protectedBy.deposit(amount);
			balance = balance - amount;
			return false;
		}	
	}
		
}
