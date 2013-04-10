/*
 * CUS1156-Lab1-part3
 * ID:92608605
 * Junjun Huang
 */
package lab1;
import java.util.*;

public class TigerTester3
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
		//new ArrayList,new OBJ
		List<Tiger> tigerArray = new ArrayList<Tiger>();
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
									tigerArray.add(tiger[i]); //add to ArrayList
								}
								tiger = null; //Unsent tiger@arrays
								/*=========================================================*/	
								
		//output part
				word(4);
				int position = 1 ;
				for (Tiger tigerArrays : tigerArray) //for each loop
				{
					System.out.println("The tiger at position "+position+":");
					tigerArrays.roar();
					position++;
				}
				word(5);
				double ave_s = 0.0;
				for (Tiger tigerArrays : tigerArray)  //for each loop
				{
					ave_s += tigerArrays.getNumberOfStripes();
				}
				if(NUM_TIGERS != tigerArray.size()) //check arraylist = size@data
					word(99);
				else
				{
				double num_tigers = (double) NUM_TIGERS;// NUM_TIGERS (int => double)
				ave_s = ave_s/num_tigers; 
				System.out.print(ave_s+"\n");
				}
										
												
		
	}

	private static void Unsent(Tiger tiger) {
		// TODO Auto-generated method stub
		
	}

	private static void Unsent(Tiger[] tiger) {
		// TODO Auto-generated method stub
		
	}
	}
