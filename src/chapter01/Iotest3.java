package chapter01;

import java.util.Scanner;

public class Iotest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner = new Scanner(System.in);
			System.out.print("승수를 입력해주세요:");
			int input = scanner.nextInt();
			int i=0,result=1;
			
			while(i<input)
			{
				result=result*2;
				i++;
			}
			
			System.out.println("2의 승수는: "+result);
			
			
			scanner.close();
		
	}

}
