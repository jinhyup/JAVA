package test04;

import java.util.Arrays;

public class Customer extends BankAccount {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts; //최대 보유 가능 계좌수 제한 어떻게?

	
	public Customer(String firstName, String lastName) {
		super(0);
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	
	void addAccount(BankAccount account) {
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return "고객의 이름 : " + firstName + lastName + ", 계좌의 갯수: " + numberOfAccounts;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
