package by.htp.lesson6.transactions.operations;

public class Credit extends Transaction {


	public Credit(int id, String description, double sum) {
		super(id, description, sum);
	}

	@Override
	public double getSum() {
		return sum * -1;
	}

}
