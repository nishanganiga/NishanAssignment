import java.util.Arrays;

//WAP to implement Anagram Checking least inbuilt methods being used

public class A4question5 
{

	public static void main(String[] args) 
	{
		String s1="A gentle Man";
		String s2="Elegant Man";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
        for (int i=0;i<s1.length(); i++) 
        { 
                 if (ch1[i] >= 'A' && ch1[i] <= 'Z')
                 {
                         ch1[i] = (char) ((int) ch1[i] + 32);  
                 }
        }
        
        for (int i=0;i<s2.length(); i++) 
        {
                 
                 if (ch2[i] >= 'A' && ch2[i] <= 'Z')
                 {
                         ch2[i] = (char) ((int) ch2[i] + 32);  
                 }
        }
       
		
		
		System.out.println(ch1);
	    System.out.println(ch2);
		
		int temp;
		for (int i=0;i<ch1.length;i++) 
		{
	         for (int j=1;j<ch1.length;j++) 
	         {
	            if(ch1[j]>ch1[j-1])
	            {
	               temp = ch1[j];
	               ch1[j] = ch1[j-1];
	               ch1[j-1] = (char) temp;
	            }
	         }
		}
		
		for (int i=0;i<ch2.length;i++) 
		{
	         for (int j=1;j<ch2.length;j++) 
	         {
	            if(ch2[j]>ch2[j-1])
	            {
	               temp = ch2[j];
	               ch2[j] = ch2[j-1];
	               ch2[j-1] = (char) temp;
	            }
	         }
		}
		
	    System.out.println(ch1);
	    System.out.println(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}

	}
}
