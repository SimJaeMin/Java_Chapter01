package chapter01;

import java.util.Scanner;

public class Nhelloworld02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int i=0;
		
		while(i<count)
		{
			System.out.println("Hello World");
			i++;
		}
	
		scanner.close();
			
	}

}
