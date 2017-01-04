package chapter01;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		for ( int i = 0; i < 20; i++ ) {

			if( i % 2 == 0 || i % 3 == 0 ) {
		           continue;
		      }

		      System.out.println( i );//2의배수와 3의배수가 아닌 자연수를 보여주는 예제이다.
		}

		*/
		
		int count=1;
		int sum=0;
				
			while(true)
			{
				sum=sum+count;
				if(sum>5000)
				{
					break;
				}
				
				count++;
			}
		
		System.out.println(sum);
		
		
		
	}

}
