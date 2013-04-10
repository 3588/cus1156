/*
 * CUS1156-Lab1-part2
 * ID:92608605
 * Junjun Huang
 */
package lab1;
import java.util.*;

public class TigerTester2
	{
	public static void word(int n)
	{
		switch(n)
		{
		case 1:
			System.out.println("Enter the tiger's name");
			break;
		case 2:
			System.out.println("Enter the tiger's weight");
			break;
		case 3:
			System.out.println("Enter the tiger's number of stripes");
			break;
		case 4:
			System.out.println("Now the tigers will roar! \n");
			break;
		case 5:
			System.out.print("\nThe average number of stripes is ");
			break;
		case 99:
			System.out.print("\nError\n ");
			break;
		default:
		
		
		}
	}
	
		public static void main(String[] args)
			{
			Scanner input = new Scanner(System.in);
			final int NUM_TIGERS = 3;
//new OBJ
			
			Tiger[] tiger = new Tiger[NUM_TIGERS];
			for (int i = 0 ; i < NUM_TIGERS ; i++)
				tiger[i] = new Tiger();
/*=========================================================*/			
			
//input part
			String[] name = new String[NUM_TIGERS];
			int[] weight = new int[NUM_TIGERS];
			int[] stripes = new int[NUM_TIGERS];
			
			for(int i = 0 ; i < NUM_TIGERS ; i++)
			{
				word(1);
				name[i] = input.next();
				word(2);
				weight[i]  = input.nextInt();
				word(3);
				stripes[i] = input.nextInt();
				if(name[i] == null || weight[i] == 0 || stripes[i] == 0) //wrong input
					word(99);
					
			}		
/*=========================================================*/			
			
//set data part
			
			for(int i = 0 ; i < NUM_TIGERS ; i++)
			{
				tiger[i].setName(name[i]);
				tiger[i].setWeight(weight[i]);
				tiger[i].setNumberOfStripes(stripes[i]);
				}
			
/*=========================================================*/	
				
//output part
				word(4);
				for (int i = 0 ; i < NUM_TIGERS ; i ++)
				{
					int t=i+1;
					System.out.println("The tiger at position "+t+":");
					tiger[i].roar();
				}
				
				word(5);
				double ave_s=0.0;
				for(int i = 0 ; i < NUM_TIGERS ; i++)
				{
					ave_s += tiger[i].getNumberOfStripes();
				}
				double num_tigers = (double) NUM_TIGERS;// NUM_TIGERS (int => double)
				ave_s = ave_s/num_tigers; 
				System.out.print(ave_s+"\n");
			}

	}