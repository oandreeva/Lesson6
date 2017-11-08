package by.htp.lesson6.transactions.clients;

public class Account {

	private int id;
	private int customerId;
	private double sum;
	private boolean blocked = false;

	public Account(int id, int customerId) {
		this.id = id;
		this.customerId = customerId;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	@Override
	public String toString() {
		return "Account[id: " + id + ", customerId: " + customerId + ", sum: " + sum + ", isBlocked: " + blocked + "]";
	}

}
