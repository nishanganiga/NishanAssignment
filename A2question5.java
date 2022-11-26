// to sort an array using Selection Sort Algorithm
package assignment2;

public class A2question5 
{
	public static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index=j;
				}
			}
			int smallNo=a[index];
			a[index]=a[i];
			a[i]=smallNo;
		}
	}

	public static void main(String[] args) 
	{
		int[] a= {6,7,9,1,5,2,4,8,3};
		System.out.println("Before the sorting:");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		selectionSort(a);
		
		System.out.println("After selection sort:");
		for(int i:a) 
		{
			System.out.print(i+" ");
		}
	}

}
