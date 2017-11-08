package by.htp.lesson6.transactions;

import by.htp.lesson6.transactions.clients.Customer;
import by.htp.lesson6.transactions.managers.AccountManager;
import by.htp.lesson6.transactions.utils.Printer;

public class Main {

	public static void main(String[] args) {
		/*
		 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возмож-
		 * ность блокировки/разблокировки счета. Реализовать поиск и сортировку
		 * счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем
		 * счетам, имеющим положительный и отрицательный балансы отдельно.
		 */
		AccountManager manager = new AccountManager();
		System.out.println("Сортированные по убыванию счета:");
		Printer.printArray(manager.sort(manager.getData().getCustomers()[0], false));
		System.out.println();
		System.out.println("Сортированные по возрастанию счета:");
		Printer.printArray(manager.sort(manager.getData().getCustomers()[0], true));
		System.out.println();

		System.out.println("Сумма средств на всех счетах пользователя:");
		Printer.printSum(manager.getSum(manager.getData().getCustomers()[0]));
		System.out.println();

		System.out.println(
				"Поиск счёта пользователя" + manager.getData().getCustomers()[1].toString() + " с минимальной суммой:");
		Printer.printAccount(manager.getCheapAccount(manager.getData().getCustomers()[1].getAccounts()));
		System.out.println();
		System.out.println("Поиск счёта пользователя" + manager.getData().getCustomers()[1].toString()
				+ " с максимальной суммой:");
		Printer.printAccount(manager.getReachAccount(manager.getData().getCustomers()[1].getAccounts()));
		System.out.println();

		System.out.println("Поиск счёта с минимальной суммой:");
		Printer.printAccount(manager.searchCheapAccount());
		System.out.println();
		System.out.println("Поиск счёта с максимальной суммой:");
		Printer.printAccount(manager.searchReachAccount());
		System.out.println();
		System.out.println("Список всех счетов:");
		for (Customer customer : manager.getData().getCustomers()) {
			Printer.printCustomer(customer);
			Printer.printArray(manager.sort(customer, true));
			System.out.println();
		}

	}

}
