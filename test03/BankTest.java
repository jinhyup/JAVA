package test03;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Customer customer1 = new Customer("Tony", "Stark");
		SavingsAccount customer1SavingAccount = new SavingsAccount(2000, 0.01);
		customer1.addAccount(customer1SavingAccount);
		customer1.addAccount(new CheckingAccount(3000, customer1SavingAccount));
		bank.addCustomer(customer1);

		Customer customer2 = new Customer("peter", "Parker");
		customer2.addAccount(new CheckingAccount(2000));
		bank.addCustomer(customer2);

		Customer customer3 = new Customer("Steve", "Rogers");
		SavingsAccount customer3SavingAccount = new SavingsAccount(2000, 0.03);
		customer3.addAccount(customer3SavingAccount);
		customer3.addAccount(new CheckingAccount(1000, customer3SavingAccount));
		bank.addCustomer(customer3);

		System.out.println();
		printCustomers(bank.getCustomers());
	}

	private static void printCustomers(Customer[] customers) {
		for (Customer c : customers) {
			if (c != null) {
				System.out.println("이름: " + c + ", 계좌의 수: " + c.getNumberOfAccounts());
				for (int i = 0; i < c.getNumberOfAccounts(); i++) {
					System.out.println("계좌종류: " + c.getAccount(i).getAccountType() + ", 잔고 : " + c.getAccount(i) + "원");
				}
				System.out.println();
			}
		}

	}
}