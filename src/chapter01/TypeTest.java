package chapter01;

public class TypeTest {

	public static void main(String[] args) {
		
		//암시적(implicity) casting 테스트!!
		
		int i1 = 9999;
		long l1 = i1;//long이 int보다 큰 자료형이기 때문에  명시적 형 변환을 안해줘도 암묵적 형 변환이 된다.
		
		long l2 = 923456789234L;
		//int i2 = l2;//error because 값이 짤리기 때문이다!!
		int i2 = (int)l2;//명시적 형 변환
		
		System.out.println(l1 +":"+i1);
		System.out.println(l2 +":"+i2);
		
		
	}
	
	
}
