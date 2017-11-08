package by.htp.lesson6.transactions.utils;

public class IdGenerator {

	private static int ID = 0;

	public static int generate() {
		return ++ID;

	}
}
