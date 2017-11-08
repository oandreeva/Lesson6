package by.htp.lesson6.transactions.clients;

public class Customer {

	private int id;
	private String name;
	private Account[] accounts;
	private int count = 0;
	private int accountLimit = 0;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setLimit(int limit) {
		this.accountLimit = limit;
	}

	public void addAccount(Account account) {
		if (accounts == null) {
			accounts = new Account[accountLimit];
		}
		if (count < accounts.length) {
			accounts[count] = account;
			count++;
		} else {
			System.out.println("customer has account limit");
		}

	}

	public void deleteAccount() {
	}

	@Override
	public String toString() {
		return "[id: " + id + ", name: " + name + "]";
	}
}
