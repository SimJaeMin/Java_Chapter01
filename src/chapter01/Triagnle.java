package chapter01;

import java.util.Scanner;

public class Triagnle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan =  new Scanner(System.in);
		System.out.print("*몇개 찍을까요?");
		int input = scan.nextInt();
		int i,j;
		
		for(i=input;i>=0;i--)
		{
			
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		scan.close();
		
		
	}

}
