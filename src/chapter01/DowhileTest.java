package chapter01;

import java.util.Scanner;

public class DowhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int value;
		do {

			System.out.println("숫자 입력[0 to Quit] ");
			value = scanner.nextInt();
			sum += value;
			System.out.println(sum);
		} while (value != 0);

		scanner.close();
	}

}
