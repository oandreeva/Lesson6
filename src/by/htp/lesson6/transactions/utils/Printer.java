package by.htp.lesson6.transactions.utils;

import by.htp.lesson6.transactions.clients.Account;
import by.htp.lesson6.transactions.clients.Customer;

public class Printer {
	public static void printArray(Account[] acc) {
		for (Account account : acc) {
			System.out.println(account.toString());
		}
	}

	public static void printAccount(Account acc) {
		System.out.println(acc.toString());
	}

	public static void printSum(double sum) {
		System.out.println("Сумма на счетах: " + sum);
	}

	public static void printCustomer(Customer customer) {
		System.out.println(customer.toString());
	}
}
