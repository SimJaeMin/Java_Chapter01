package chapter01;

public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {100, 200, 300};
		int[] b= {100, 200, 300};
		
		
		boolean result = equals(a,b);
		System.out.println(result);
		
		
	}
	
	
	public static boolean equals(int[] arr1, int[] arr2)
	{
		if(arr1 == null || arr2 == null)
		{
			return false;	
		}
		
		
		if(arr1.length != arr2.length)
		{
			return false;
		
		}
		
		
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i] != arr2[i])
			{
				return false;
			}
			
		}
		
		return true;
		
	}

}
