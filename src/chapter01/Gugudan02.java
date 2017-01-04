package chapter01;

public class Gugudan02 {

	public static void main(String[] args) {
		
		int i,j,result=1;
		
		
		for(j=1;j<10;j++)
		{
			for(i=2;i<10;i++)
			{
				result=i*j;
				System.out.print(i+"*"+j+"="+result+"");
				System.out.print("\t\t");
			}
			System.out.println();
						
		}
		
	}
	
	
}
