import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		float var1, var2, result;
		int choice;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");

			System.out.print("Your choice : ");
			// choice = scan.nextInt();
			choice = Integer.parseInt(args[0]);

			if (choice == 5)
				System.exit(0);

			System.out.print("1st Number : ");
			// var1 = scan.nextInt();
			var1 = Integer.parseInt(args[1]);

			System.out.print("2nd Number : ");
			// var2 = scan.nextInt();
			var2 = Integer.parseInt(args[2]);

			switch (choice) {
				case 1:
					System.out.println(var1 + " + " + var2 + " = " + (var1 + var2));
					break;
				case 2:
					System.out.println(var1 + " - " + var2 + " = " + (var1 - var2));
					break;
				case 3:
					System.out.println(var1 + " * " + var2 + " = " + (var1 * var2));
					break;
				case 4:
					if (var2 == 0) {
						System.out.println("Divide by Zero error");
						System.exit(0);
					}
					System.out.println(var1 + " / " + var2 + " = " + (var1 / var2));
					break;
				default:
					System.out.println("Please select the correct choice...");
			}
			System.out.println("---------------------------------------------------------------");
		} while (true);
	}
}