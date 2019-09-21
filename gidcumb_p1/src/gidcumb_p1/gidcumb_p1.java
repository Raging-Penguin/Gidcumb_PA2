package gidcumb_p1;

import java.util.Scanner;
public class gidcumb_p1 {
	
	
	public static int encrypt(int og)
	{
		int encryptedVal = (og+7)%10;
		return og;
	}
	
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		int y;
		int i =0;
		
		
		while ( i != 10)
		{
			int x =i;
		int display = (x+7)%10;
		System.out.println(display);
		if (display >= 7){
			y= (display-7);
			}else
			{
		y = (display-7)+10;
			}
		if(y==x)
		
		{
			System.out.println("Encrypt and Decrypt match."+ x +"=" + y);
		}
		i++;
		}
	}

	}




