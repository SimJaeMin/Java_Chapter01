package chapter01;

import java.util.Scanner;

public class Sumtoinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int count;
		int result=0;
		System.out.print("입력:");
		int input = scanner.nextInt();
		
		for(count=1;count<=10;count++)
		{
			
			result=count+result;

		}

		System.out.println("결과값:"+result);
		
		
		
		
		
		
		scanner.close();
		
		
		
		
	}

}
