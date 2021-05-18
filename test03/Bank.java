package test03;

public class Bank extends Customer{
	private Customer[] customers;	//은행 고객목록
	private int numberOfCustomers;	//은행 고객 수
	
	public Bank() {	//배열 크기 10으로 초기화
		super("","");
		customers = new Customer[10];	
	}
	
	void addCustomer(Customer customer) {
		this.customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}
		
}
