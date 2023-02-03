//WAP to count the number of consonants, vowels, special characters in a String.


public class A4question4 
{

	public static void main(String[] args) 
	{
		int cCount=0;
		int vCount=0;
		int sCount=0;
		
		String str="The entered 'string' have consonants, variable & special characters:-!";
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
					str.charAt(i)=='o' ||str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				cCount++;
			}
			else if(str.charAt(i)>=32 && str.charAt(i)>=47 || str.charAt(i)>=32 &&str.charAt(i)>=32 ||
					str.charAt(i)>=58 && str.charAt(i)>=64 ||
					str.charAt(i)>=91 && str.charAt(i)>=96 ||
					str.charAt(i)>=123 &&str.charAt(i)>=126)
			{
				sCount++;
			}
		}
		
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
		System.out.println("Number of special characters: " + sCount);
	}

}
