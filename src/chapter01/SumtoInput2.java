package chapter01;

public class SumtoInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {

			System.out.println("java SumToInput2 number");
			return;
		}
		
		System.out.println(args[0] );//args는 string 따라서 변환 과정이 필요, string을  integer로 변경
		
		/*
		 
		 int -> string 으로 변환
		 
		 String s1 = String.valueof(n);
		 
		 */
		
		int number = Integer.parseInt(args[0]);

		int sum = 0;

		for (int i = 0; i <= number; i++) {

			sum = sum + i;

		}
		System.out.println(sum);

	}

}
