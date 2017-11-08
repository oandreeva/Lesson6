package by.htp.lesson6.transactions;

import by.htp.lesson6.transactions.clients.Customer;
import by.htp.lesson6.transactions.managers.AccountManager;
import by.htp.lesson6.transactions.utils.Printer;

public class Main {

	public static void main(String[] args) {
		/*
		 * �����. ������ ����� ����� ��������� ������ � �����. ��������� ������-
		 * ����� ����������/������������� �����. ����������� ����� � ����������
		 * ������. ���������� ����� ����� �� ������. ���������� ����� �� ����
		 * ������, ������� ������������� � ������������� ������� ��������.
		 */
		AccountManager manager = new AccountManager();
		System.out.println("������������� �� �������� �����:");
		Printer.printArray(manager.sort(manager.getData().getCustomers()[0], false));
		System.out.println();
		System.out.println("������������� �� ����������� �����:");
		Printer.printArray(manager.sort(manager.getData().getCustomers()[0], true));
		System.out.println();

		System.out.println("����� ������� �� ���� ������ ������������:");
		Printer.printSum(manager.getSum(manager.getData().getCustomers()[0]));
		System.out.println();

		System.out.println(
				"����� ����� ������������" + manager.getData().getCustomers()[1].toString() + " � ����������� ������:");
		Printer.printAccount(manager.getCheapAccount(manager.getData().getCustomers()[1].getAccounts()));
		System.out.println();
		System.out.println("����� ����� ������������" + manager.getData().getCustomers()[1].toString()
				+ " � ������������ ������:");
		Printer.printAccount(manager.getReachAccount(manager.getData().getCustomers()[1].getAccounts()));
		System.out.println();

		System.out.println("����� ����� � ����������� ������:");
		Printer.printAccount(manager.searchCheapAccount());
		System.out.println();
		System.out.println("����� ����� � ������������ ������:");
		Printer.printAccount(manager.searchReachAccount());
		System.out.println();
		System.out.println("������ ���� ������:");
		for (Customer customer : manager.getData().getCustomers()) {
			Printer.printCustomer(customer);
			Printer.printArray(manager.sort(customer, true));
			System.out.println();
		}

	}

}
