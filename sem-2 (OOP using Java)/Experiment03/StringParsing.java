import java.util.Scanner;

class StringParsing
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		
		int uppercase=0,lowercase=0, digit=0,blankSpace=0, specialCharacter=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				lowercase++;
			}
			else if(Character.isUpperCase(s.charAt(i)))
			{
					uppercase++;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
					digit++;
			}
			else if(s.charAt(i)==' ')
			{
				blankSpace++;
			}
			else
			{
				specialCharacter++;
			}
		}
		
		System.out.println("No. of lowercase letter : " + lowercase);
		System.out.println("No. of uppercase letter : " + uppercase);
		System.out.println("No. of Digits : " + digit);
		System.out.println("No. of Blank Spaces : " + blankSpace);
		System.out.println("No. of Special Characters: " + specialCharacter);
	}
	
}