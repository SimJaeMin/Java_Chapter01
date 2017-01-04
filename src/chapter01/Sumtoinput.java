package chapter01;

import java.util.Scanner;

public class Sumtoinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int count;
		int result=0;
		
		int input =1;
		
		while(input!=0)
		{
			
		System.out.print("입력:");	
		input = scanner.nextInt();
		
		for(count=1;count<=input;count++)
		{
			
			result=count+result;

		}
		
		

		System.out.println("결과값:"+result);
		result=0;
		}
		
		
		
		
		scanner.close();
		
		
		
		
	}

}
