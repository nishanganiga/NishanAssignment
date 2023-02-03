import java.util.Arrays;

//WAP to implement Pangram Checking with least inbuilt methods being used.

public class A4question6 {

	public static void main(String[] args) {

	String s1="the quick brown fox jumps over lazy dog";
	String s2="abcdefghijklmnopqrstuvwxyz";
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
		
		//System.out.println(ch1);
		//System.out.println(ch2);
		
		int temp;
		for (int i=0;i<ch1.length;i++) 
		{
	         for (int j=1;j<ch1.length;j++) 
	         {
	            if(ch1[j]<ch1[j-1])
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
	            if(ch2[j]<ch2[j-1])
	            {
	               temp = ch2[j];
	               ch2[j] = ch2[j-1];
	               ch2[j-1] = (char) temp;
	            }
	         }
		}
		//System.out.println(ch1);
		//System.out.println(ch2);
		
		int index1=0;
		
		for(int i=0;i<ch1.length;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(ch1[i]==ch1[j])
				{
					break;
				}
			}
			if(j==i)
			{
				ch1[index1++]=ch1[i];
			}
		}
		String pan1=String.valueOf(Arrays.copyOf(ch1, index1));
		
		int index2=0;
		
		for(int i=0;i<ch2.length;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(ch2[i]==ch2[j])
				{
					break;
				}
			}
			if(j==i)
			{
				ch2[index2++]=ch2[i];
			}
		}
		String pan2=String.valueOf(Arrays.copyOf(ch2, index2));
		
		//System.out.println(pan1);
		//System.out.println(pan2);
		
		if(pan1.equals(pan2))
		{
			System.out.println("it is panagram");
		}
		else
		{
			System.out.println("it  is not panagram");
		}

	}

}


