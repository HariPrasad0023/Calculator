import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		float var1, var2;
		int choice;

		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		// Scanner scan = new Scanner(System.in);

		System.out.println("Your choice : ");
		// choice = scan.nextInt();
		choice = Integer.parseInt(args[0]);
		// choice = scan.next().charAt(0);

		System.out.println("1st Number : ");
		// var1 = scan.nextInt();
		var1 = Integer.parseInt(args[1]);
		// var1 = scan.nextFloat();

		System.out.println("2nd Number : ");
		// var2 = scan.nextInt();
		var2 = Integer.parseInt(args[2]);
		// var2 = scan.nextFloat();

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
	}
}