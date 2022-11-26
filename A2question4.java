//to sort an array using Merge Sort Algorithm
package assignment2;


public class A2question4 
{
	void merge(int a[],int beg, int mid, int end)
	{
		int i,j,k;
		int n1=mid-beg+1;
		int n2=end-mid;
		
		int lArray[]=new int[n1];
		int rArray[]=new int[n2];
		
		for(i=0;i<n1;i++)
			lArray[i]=a[beg+i];
		
		for(j=0;j<n2;j++)
			rArray[j]=a[mid+1+j];
		
		i=0;
		j=0;
		k=beg;
		
	
		while(i<n1 && j<n2)
		{
			if(lArray[i]<=rArray[j])
			{
				a[k]=lArray[i];
				i++;
			}
			else
			{
				a[k]=rArray[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=lArray[i];
			i++;	
			k++;
		
		}
		while(j<n2)
		{
			a[k]=rArray[j];
			j++;
			k++;
		}
	}
	void mergeSort(int a[],int beg,int end)
	{
		if(beg<end)
		{
			int mid=(beg+end)/2;
			mergeSort(a,beg,mid);
			mergeSort(a,mid+1,end);
			merge(a,beg,mid,end);
			
		}
	}
	void printArray(int a[], int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(a[i]+ " ");
	}
	

	public static void main(String[] args) 
	{
		int[] a= {7,6,8,4,1,2,3,5,9};
		int n=a.length;
		A2question4 m1=new A2question4();
		System.out.println("Array before sorting:");
		m1.printArray(a, n);
		m1.mergeSort(a, 0, n-1);
		System.out.println();
		System.out.println();
		System.out.println("Array after sorting:");
		m1.printArray(a, n);
		System.out.println();
				

	}

}
