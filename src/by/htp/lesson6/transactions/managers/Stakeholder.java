package by.htp.lesson6.transactions.managers;

import by.htp.lesson6.transactions.clients.Account;
import by.htp.lesson6.transactions.clients.Customer;
import by.htp.lesson6.transactions.utils.IdGenerator;

public class Stakeholder {
	private Customer[] customers;
	private int count = 0;

	public Stakeholder() {
		addCustomer(getCustomer("John Snow"));
		addCustomer(getCustomer("Serseya Lanister"));
		addCustomer(getCustomer("Tirion Lanister"));
		addCustomer(getCustomer("Sansa Stark"));
		addCustomer(getCustomer("Daeneris Targarien"));
	}

	public Customer[] getCustomers() {
		return customers;
	}

	private Account getAccount(int customerId) {
		Account account = new Account(IdGenerator.generate(), customerId);
		account.setSum(Math.random() * 1000 + 1);
		return account;
	}

	private Customer getCustomer(String name) {
		Customer customer = new Customer(IdGenerator.generate(), name);
		int count = (int) (Math.random() * 5 + 2);
		customer.setLimit(count);
		for (int i = 0; i < count; i++) {
			customer.addAccount(getAccount(customer.getId()));
		}
		return customer;
	}

	private void addCustomer(Customer customer) {
		if (customers == null) {
			customers = new Customer[5];
		}
		if (count < customers.length) {
			customers[count] = customer;
			count++;
		} else {
			System.out.println("Customer limit.");
		}
	}

}
