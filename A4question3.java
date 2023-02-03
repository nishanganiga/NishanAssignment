//WAP to check if “2552” is palindrome or not.

public class A4question3 {

	public static void main(String[] args) 
	{
		int r;
		int sum=0;
		int temp;    
		int n=2552;
		  
		  temp=n;  
		  
		  while(n>0)
		  {    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum) 
		  {
		   System.out.println("palindrome");  
		  }
		  else   
		  {
		   System.out.println("not a palindrome"); 
		  }
		
	}

}
