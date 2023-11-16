package atm;

import java.util.Scanner;

public class ATMProject {
	public static void main(String[] args) {
		int pin = 1234;
		int balance = 10000;

		int addAmount = 0;
		int takeAmount = 0;

		String name;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Pin Number 1234 : ");

		int password = scanner.nextInt();

		if (password == pin) {
			System.out.println("Enter your Name :");
			name = scanner.next();
			while (true) {

				System.out.println("Press 1 to check the balance");
				System.out.println("press 2 to add amount");
				System.out.println("Press 3 to take amount");
				System.out.println("Press 4 to take receipt");
				System.out.println("Press 5 to EXIT");

				int opt = scanner.nextInt();
				switch (opt) {
				case 1:
					System.out.println("Your current balance :" + balance);
					break;

				case 2:
					System.out.println("How much amount did you want to add to your account : ");
					addAmount = scanner.nextInt();
					System.out.println("Successfully Credited");
					balance = addAmount + balance;
					break;

				case 3:
					System.out.println("How much amount do you want to take :");
					takeAmount = scanner.nextInt();
					if (takeAmount > balance) {
						System.out.println("Insufficient Balance");
						System.out.println("Try less than your balance available");
					} else {
						System.out.println("Successfully Taken amount");
						balance = balance - takeAmount;
					}
					break;
				case 4:
					System.out.println("Welcome to ATM");
					System.out.println("Available Balance is : " + balance);
					System.out.println("Amount Deposited : " + addAmount);
					System.out.println("Amount Taken :" + takeAmount);
					System.out.println("Thank You " + name);
				case 5:
				default:

					break;
				}

				if (opt == 5)

				{
					System.out.println("Thank You " + name);
					break;
				}
			}
		} else {
			System.out.println("Wrong PIN Number");
		}

	}

}
