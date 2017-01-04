
package chapter01;
import java.util.*;	// Scanner 클래스를 사용하기 위함
	
public class PrimeDetec {

   public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	System.out.print("소수인지 판단할 숫자: ");

	int divisor = 2;
	int num = stdin.nextInt();
	boolean isPrime = true;

	while(divisor<num)
{
	
		if(num%divisor==0)
		{
			isPrime = false;
		}
		
		divisor++;
		
}
	
	
	if (isPrime) {
		System.out.println(num + "은 소수입니다.");
		} 
	
	else {
		System.out.println(num + "은 소수가 아닙니다.");

		}
    }	
}

