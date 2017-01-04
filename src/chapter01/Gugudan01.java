package chapter01;

import java.util.Scanner;

public class  Gugudan01  {

	   public static void main(String[] args) {
		   int i=1,j=1,result=1;
		   
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("몇 단 출력?");
		   
		   int input = scanner.nextInt();
		   System.out.println("2단에서 "+input+"단");
		   
		   for(i=2;i<=input;i++)
		   {
			   
			   for(j=1;j<10;j++)
			   {
				   result=i*j;
				   System.out.println(i+"*"+j+"="+result);
			   }
			   System.out.println();
		   }
		   
		   
		   
	   scanner.close();
	   
	   }
	   
}
