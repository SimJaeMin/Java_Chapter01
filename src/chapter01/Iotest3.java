package chapter01;

import java.util.Scanner;

public class Iotest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*Scanner scanner = new Scanner(System.in);
			System.out.print("승수를 입력해주세요:");
			int input = scanner.nextInt();
			int i=0,result=1;
			
			while(i<input)
			{
				result=result*2;
				i++;
			}
			
			System.out.println("2의 승수는: "+result);
			*/
		
		Scanner scanner = new Scanner( System.in );

		int result = 1;
		System.out.print("승수: ");
		
		int pow = scanner.nextInt();
		int i=1;
		// Q: 아래 while 반복문을 작성하시오.
		
		while(i<=pow)
		{
			result=2*result;
			i++;
		}
		
		
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
			
			scanner.close();
		
	}

}
