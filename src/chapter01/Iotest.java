package chapter01;

import java.util.Scanner;

public class Iotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
			System.out.println("Hello world");
			System.out.print("Hello world");//ln(line의 약자 ) 개행문자
			System.out.println("Hello world");
		*/
		//줄만 바꿀때
			//System.out.println("");
		/*	System.out.println("Hello world");
			System.out.print("\n");
			System.out.println("Hello world");
		*/
			Scanner scanner = new Scanner(System.in);//자원을 열면 닫아줘야 한다!!
////			
//////			int count1 = scanner.nextInt();//입력된 값으 묶어서 보내주즌 일
//////			int count2 = scanner.nextInt();
//		String str = scanner.next();//문자 입력
//////			
////		System.out.println(count1+":"+count2+":"+str);
////			
//			String str2 = scanner.next();
//			System.out.println(str2);
//			 str2 = scanner.next();
//			System.out.println(str2);
			
			String str2 = scanner.nextLine();
			System.out.println(str2);
			
			//키보드 자원 정리
			scanner.close();
			
			
			
		
	}

}
