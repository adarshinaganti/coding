import java.util.Scanner;

public class Main{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		final int dollarValue = 100;
		final int quarterValue = 25;
		final int dimeValue = 10;
		final int nickelValue = 5;
		final int pennyValue = 1;

		System.out.print("Enter the amount in cents: ");
		int amount = sc.nextInt();

		int dollars = amount / dollarValue;
		int balance = amount - (dollars * dollarValue);

		int quarters = balance / quarterValue;
		balance -= quarters * quarterValue;
		
		int dimes = balance / dimeValue;
		balance -= dimes * dimeValue;

		int nickels = balance / nickelValue;
		balance -= nickels * nickelValue;

		int pennies = balance * pennyValue;

		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
	}
}z