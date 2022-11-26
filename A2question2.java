// to sort an array using Quick Sort Algorithm
package assignment2;

public class A2question2 
{
	int partition(int a[],int low,int high)
	{
		int qs=a[high];
		int i=(low-1);
				
		for(int j=low;j<high;j++)
		{
			if(a[j]<=qs)
			{
				i++;
				
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		
		return i+1;
		
	}
	void sort(int a[], int low, int high)
	{
		if(low<high)
		{
			int pi=partition(a,low,high);
			sort(a,low,pi-1);
			sort(a,pi+1,high);
			
		}
	}
	static void printArray(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;++i)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) 
	{
		int a[]= {10,8,12,11,2,4,5,6};
		int n=a.length;
		
		A2question2 ob=new A2question2();
		ob.sort(a, 0, n-1);
		
		System.out.println("Sorted Array is");
		printArray(a);

	}

}
