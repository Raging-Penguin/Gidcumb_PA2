package gidcumb_p3;
import java.util.Scanner;
public class gidcumb_p3 {
	public static int sum(int[] array)
	{int sum =0;
		for( int i=0; i<array.length;i++) 
		{
		 sum +=array[i]*(i+1);
		}
		return sum;
	}
	public static void main(String[] arg)
	{ Scanner scan = new Scanner(System.in);
		int sentinel= 1;
		int input;
		int hi=0;
		String high="ph";
		String low ="ph";
		int totalPolls=0;
		String[] topics = new String[5];
		topics[0] ="FPS:";
		topics[1] = "RPG:";
		topics[2]= "Puzzle:";
		topics[3]= "Platformer:";
		topics[4]= "MMO:";
		
		int[][] responses =new int [5][10];
		while(sentinel==1)
		{
			System.out.println("Please rate the following genres, with 1 being the lowest and 10 being the highest");
			for (int j=0; j<topics.length; j++)
			{
			System.out.println(topics[j]);
			input = scan.nextInt();
			responses[j][input-1]++;
			}
			System.out.println("Thank you for your feedback!");
			System.out.println("Would you like to start a new poll? Press 1 to start again, press 0 to exit:  ");
			sentinel = scan.nextInt();
			totalPolls++;
		}
		System.out.println("Total data collected from poll: ");
		System.out.println("Totals:     1:    2:    3:    4:    5:    6:    7:    8:    9:    10:");
			for(int c =0; c<topics.length; c++)
			{
				System.out.println("");
				System.out.printf("%-12s",topics[c]);
					for(int f = 0; f < responses[c].length; f++)
					{
						System.out.print(responses[c][f]+"     ");
				
					}
					System.out.println("Average score: " + sum(responses[c])/totalPolls);
			}
			int lo =10*totalPolls;
			for(int t =0; t<topics.length; t++)
			{
				if(sum(responses[t])> hi)
				{
					hi =sum(responses[t]);
					high = topics[t];
				}
				if(sum(responses[t])<lo)
				{
					lo=sum(responses[t]);
					low = topics[t];
				}
			}
			System.out.println("The genre with the highest score was "+ high + " with a total score of "+ hi);
			System.out.println("The genre with the lowest score was "+ low + " with a total score of " + lo);
	}

}
