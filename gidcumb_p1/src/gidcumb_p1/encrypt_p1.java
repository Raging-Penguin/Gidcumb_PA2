package gidcumb_p1;
import java.util.Scanner;


public class encrypt_p1 {
	
	
	public static int encrypt(int og)
	{
		int encryptedVal = (og+7)%10;
		return encryptedVal;
	}
	
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		int id;
		int d1, d2, d3, d4=0;
		int valHolder;
		System.out.println("Input 4 digit integer to be encrypted: ");
		 id = scan.nextInt();
		 //Breaking the number down by decimal places to give individual digits.
		 d1 = id/1000;
		 d2 = id/100%10;
		 d3 = id/10%10;
		 d4 = id%10;
		// encrypt function adds 7 to original digit, divides by 10 and assigns the remainder as the new value
		 d1= encrypt(d1);
		 d2 = encrypt(d2);
		 d3= encrypt(d3);
		 d4 = encrypt(d4);
		 
		 //Rotation of the encrypted digits;
		 valHolder =d3;
		 d3=d1;
		 d1=valHolder;
		 valHolder = d4;
		 d4=d2;
		 d2=valHolder;
		 
		 
		 System.out.println("The encrypted value is: ");
		 System.out.print(d1);
		 System.out.print(d2);
		 System.out.print(d3);
		 System.out.print(d4);

		
		
	}

}
