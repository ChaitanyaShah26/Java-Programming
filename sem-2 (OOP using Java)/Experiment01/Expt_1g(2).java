/*
WAP to display the following patterns:
   A
  CB 
 FED
JIHG
*/

import java.util.Scanner;

class PatternAlpha{
	 public static void main(String[] args) 
	 {
		 Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number of lines:");
		int n=sc.nextInt();
		inti,j;
		 char k;
		 char sum= 'A' - 1;
		 for(i=1;i<=n;i++)
		 {
			 for(j=1;j<=n-i;j++)
			 {
				System.out.print(" ");
			 }
			 sum = (char)(sum + i);
			 k=sum;
			 for(j=1;j<=i;j++)
			 {
				System.out.print(k);
				 k--;
			}
		System.out.print("\n");
		}
	 }
}
