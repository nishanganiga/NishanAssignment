		// WAP to find if String contains all unique characters.

public class A4question7 {

	public static void main(String[] args) {

		String str="abcdefghijklmnopqrstuvwxyz";
		String str1="";
		String str3="";
		String str2="";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			str1=String.valueOf(ch);
			if(str2.contains(str1))
			{
				str3=str3+str1;
				count++;
			}
			else
			{
				str2=str2+str1;
			}
		}	
		
		if(count>=1)
		{
			System.out.println("all the charchters are not unique");
			
		}
		else
		{
			System.out.println("all the charchters are unique");
		}
	}
}
