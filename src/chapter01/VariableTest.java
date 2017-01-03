package chapter01;

public class VariableTest {
	int number;
	
	public void test(){
		//int j = number+10; //인스탄스 변수는 초기화가 된다. 왜냐하면 자동 초기화 되기 때문이다.
		//System.out.println(j);
	}
	
	public static void main(String[] args) {
		
		int i = 30;
		//int i = 20; //에러 변수는 식별자다.
		
	   int j = i; // local variable은 반드시 초기화 해줘야 한다.
		char c = 'a';
		char c1 =65;
		//int j = 10;
		/*
		boolean isHoliday = false;
		char c = 'A';
		byte b = 10;
		short a = 20;
		int k = 10;
		long l = 123456789;
		float f =3.14f;
		double d =3.14;
		*/
		//System.out.println(j);
		//System.out.println(i);
		System.out.println(c+":"+c1);
		
		
	}
	

}
