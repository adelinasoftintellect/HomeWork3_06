import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please, enter your points (1 - 9)");
		int a = input.nextInt();

		if (a >= 1 && a <= 3) {
			System.out.println("Your bonus is: " + (a * 5));

		} else if (a >= 4 && a <= 6) {
			System.out.println("Your bonus is: " + (a * 10));

		} else if (a >= 7 && a <= 9) {
			System.out.println("Your bonus is: " + (a * 50));

		} else {
			System.out.println("Please, enter the right number of your points");
		}

		input.close();

	}
}