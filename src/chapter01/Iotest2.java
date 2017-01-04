package chapter01;

import java.util.Scanner;

public class Iotest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner = new Scanner(System.in);
			System.out.print("count:");
			int count = scanner.nextInt();
			int i=0;
			System.out.println(count);
			
			
			while(i<count)
			{
				System.out.println(i+"회 "+"호정아 안녕!!");
				i++;
			}
			
			scanner.close();
	}

}
