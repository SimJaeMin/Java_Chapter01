package chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {

		int[] a = new int[4];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		//a[4] = 50; //error 예외발생 (ArrayIndexOutofBound)
		
		int length = a.length;
		int sum = 0;
		
		for(int i = 0; i < length; i++)
		{
		
			sum=sum + a[i];
			
		}
		System.out.println(sum);
		
		//확장 for(for~ each)
		sum=0;
		for(int value : a) //배열이란 리스트 객체만 들어갈 수 있다.
		{
			sum=value+sum;
			//System.out.println(value);
			System.out.println(sum);
		}
		
		
		
		
		
	}

}
