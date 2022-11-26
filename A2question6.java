//to check whether an array is a subset of another array
package assignment2;

public class A2question6 
{
	static boolean isSubset(int ar1[], int ar2[], int m, int n)
	{
		 int i = 0;
	     int j = 0;
	        for (i = 0; i < n; i++) 
	        {
	            for (j = 0; j < m; j++)
	                if (ar2[i] == ar1[j])
	                    break;
	 
	           
	            if (j == m)
	                return false;
	        }
	 
	        
	        return true;
	}
		
	
	
	public static void main(String[] args) 
	{
		int[] ar1= {7,8,9,11,14,13,1,2,3,4};
		int[] ar2= {8,1,2,9};
		
		int m=ar1.length;
		int n=ar2.length;
		
		if(isSubset(ar1,ar2,m,n))
		{
			System.out.print("Array ar2 is the subset of array ar1");
		}
		else
		{
			System.out.print("Array ar2 is not the subset of array ar1");
		}

	}

}
