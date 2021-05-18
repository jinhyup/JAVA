package test04;

public abstract class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (amount < balance && amount > 0) {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		} else if (amount > balance || amount < 0) {
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return String.format("%,d", this.balance);
	}

	public abstract String getAccountType();
}