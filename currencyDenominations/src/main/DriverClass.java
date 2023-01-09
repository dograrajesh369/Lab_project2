package main;

import java.util.Scanner;

import Com.gl.currency.CurrencyDenominations;

public class DriverClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // user defined datatype
		System.out.print("Enter the size of currency denominations: ");
		int size = scanner.nextInt();

		int[] denominations = new int[size]; // n-1
		System.out.println("Enter the currency denominations value: ");

		for (int i = 0; i < size; i++) {
			denominations[i] = scanner.nextInt();
		}
		System.out.print("Enter the amount you want to pay: ");
		int amount = scanner.nextInt();
		scanner.close();

		CurrencyDenominations sort = new CurrencyDenominations(denominations);
		sort.makePayment(amount);
	}

}
