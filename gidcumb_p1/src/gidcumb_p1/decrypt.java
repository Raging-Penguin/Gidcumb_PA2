package gidcumb_p1;
import java.util.Scanner;
public class decrypt {
	
	public static int decrypt(int og)
	{
		int decryptVal;
		if (og>=7)
		{
			decryptVal = og-7;
		}else 
		{
			decryptVal= (og-7)+10;
		}
		return decryptVal;
	}
	
public static void main(String[] arg)
{
	int d1, d2, d3, d4, valHolder=0;
	int input;
	Scanner scan = new Scanner(System.in);

	System.out.println("Input 4 digit encrypted value: ");
	input = scan.nextInt();
	
	 d1 = input/1000;
	 d2 = input/100%10;
	 d3 = input/10%10;
	 d4 = input%10;
	 
	 d1 = decrypt(d1);
	 d2 = decrypt(d2);
	 d3 = decrypt(d3);
	 d4 = decrypt(d4);
	 
	 
	valHolder=d1;
	d1=d3;
	d3=valHolder;
	valHolder=d2;
	d2=d4;
	d4=valHolder;
	 
	System.out.println("Your decrypted value is:");
	System.out.print(d1);
	System.out.print(d2);
	System.out.print(d3);
	System.out.print(d4);


}

}
