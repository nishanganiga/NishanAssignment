import java.util.Arrays;

//WAP to find the maximum occurring character in a String.

public class A4question8 {

	public static void main(String[] args) {
		 String k="mmmain";
	      char tempArray[] = k.toCharArray(); 
	        Arrays.sort(tempArray); 
	        String s = new String(tempArray);
	        int n = s.length();
	        int maxCount = 0;
	        int count = 1;
	        char ans = '-';
	        for (int i = 1; i <= n; i++)
	        {
	            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
	            {
	                if (maxCount < count)
	                {
	                    maxCount = count;
	                    ans = s.charAt(i-1);
	                }
	                count = 1;
	            }
	            else
	            {
	                count++;
	            }
	        }
	    System.out.println("Maximum occurring character is "+ans);
	}

}
