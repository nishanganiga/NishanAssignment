//to find the duplicates present in an array
package assignment2;



public class A2question1 
{

	public static void main(String[] args) 
	{
		int[] a = {1,5,6,8,3,2,1,4,6,9,8,7,5};
		System.out.println("Duplicates present in the array are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
