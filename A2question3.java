//to sort an array using Bubble Sort Algorithm.
package assignment2;

public class A2question3 
{

	public static void main(String[] args) 
	{
		int[] a = {20,40,30,10,80,50,60,70};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j]<a[j-1])
				{
					int temp = a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					
				}
			}
		}
		for(int el:a)
		{
			System.out.print(el + " ");
		}
	}

}
