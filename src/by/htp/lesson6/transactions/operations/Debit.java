package by.htp.lesson6.transactions.operations;

public class Debit extends Transaction {
	
	
	public Debit(int id, String description, double sum) {
		super(id, description, sum);
	}

	@Override
	public double getSum() {
		return sum;
	}

}
