package by.htp.lesson6.transactions.operations;

public abstract class Transaction {

	private int id;
	private String description;
	protected double sum;

	public Transaction(double sum) {
		this.sum = sum;
	}

	public Transaction(int id, String description, double sum) {
		this.id = id;
		this.description = description;
		this.sum = sum;
	}

	public abstract double getSum();
}
