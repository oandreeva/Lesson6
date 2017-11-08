package by.htp.lesson6.transactions.managers;

import by.htp.lesson6.transactions.operations.Credit;
import by.htp.lesson6.transactions.operations.Debit;
import by.htp.lesson6.transactions.operations.Transaction;
import by.htp.lesson6.transactions.utils.IdGenerator;

public class TransactionManager {

	public void executeDebit(String description, double sum) {

		Debit debit = new Debit(IdGenerator.generate(), description, sum);
		executeTransaction(debit);

	}

	public void executeCredit(String description, double sum) {

		Credit credit = new Credit(IdGenerator.generate(), description, sum);
		executeTransaction(credit);

	}

	private void executeTransaction(Transaction transaction) {
		

	}

}
