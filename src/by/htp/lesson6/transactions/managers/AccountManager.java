package by.htp.lesson6.transactions.managers;

import by.htp.lesson6.transactions.clients.Account;
import by.htp.lesson6.transactions.clients.Customer;

public class AccountManager {

	private final Stakeholder stakeholder = new Stakeholder();

	public Stakeholder getData() {
		return stakeholder;
	}

	public void blockAccount(Account account) {
		account.setBlocked(true);
	}

	public void unblockAccount(Account account) {
		account.setBlocked(false);
	}

	public Account searchReachAccount() {
		Account maxSum = null;
		for (Customer customer : stakeholder.getCustomers()) {
			Account acc = getReachAccount(customer.getAccounts());
			if (maxSum == null || maxSum.getSum() < acc.getSum()) {
				maxSum = acc;
			}
		}
		return maxSum;
	}

	public Account searchCheapAccount() {
		Account minSum = null;
		for (Customer customer : stakeholder.getCustomers()) {
			Account acc = getCheapAccount(customer.getAccounts());
			if (minSum == null || minSum.getSum() > acc.getSum()) {
				minSum = acc;
			}
		}
		return minSum;
	}

	public Account getCheapAccount(Account[] acc) {
		Account minSum = null;
		for (Account account : acc) {
			if (minSum == null || minSum.getSum() > account.getSum()) {
				minSum = account;
			}
		}
		return minSum;
	}

	public Account getReachAccount(Account[] acc) {
		Account maxSum = null;
		for (Account account : acc) {
			if (maxSum == null || maxSum.getSum() < account.getSum()) {
				maxSum = account;
			}
		}
		return maxSum;
	}

	public Account[] sort(Customer customer, boolean asc) {
		int count = 0;
		Account[] arr = customer.getAccounts();
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (asc) {
					if (arr[j].getSum() > arr[j + 1].getSum()) {
						Account t = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = t;
					}
				} else {
					if (arr[j].getSum() < arr[j + 1].getSum()) {
						Account t = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = t;
					}
				}

			}
		}

		return arr;
	}

	public double getSum(Customer customer) {
		double allSum = 0d;
		for (Account acc : customer.getAccounts()) {
			allSum += acc.getSum();
		}

		return allSum;

	}
}
