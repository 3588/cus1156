package cus1156.lab1;

	/**
	 * Represents one tiger. Each tiger has a name,
	 * a weight, and the number of stripes
	 * @author Bonnie MacKellar
	 *
	 */
	public class Tiger
		{
			private String name;
			private int numberOfStripes;
			private double weight;
			
			private static final int HEAVY_TIGER = 500;
			
			/**
			 * The tiger announces its name and roars
			 * Large tigers (greater than 500 lbs) have loud roars
			 * Smaller tigers have softer roars
			 * 
			 */
			void roar()
				{
					if (weight > HEAVY_TIGER)
					{
						System.out.println(name + " says ROARRRRRRR!!!");
					}
					else
					{
						System.out.println(name + " says Roar");
					}
				}

			/**
			 * return the tiger's name
			 * @return String
			 */
			public String getName()
				{
					return name;
				}

			/**
			 * assign the tiger's name
			 * @param name
			 */
			public void setName(String name)
				{
					this.name = name;
				}

			/**
			 * return the number of stripes that the tiger has
			 * @return integer number of stripes
			 */
			public int getNumberOfStripes()
				{
					return numberOfStripes;
				}

			/**
			 * assign the number of stripes
			 * @param numberOfStripes
			 */
			public void setNumberOfStripes(int numberOfStripes)
				{
					this.numberOfStripes = numberOfStripes;
				}

			/**
			 * return the tiger's weight in pounds
			 * @return weight
			 */
			public double getWeight()
				{
					return weight;
				}

			/**
			 * assign the tiger's weight in pounds
			 * @param weight
			 */
			public void setWeight(double weight)
				{
					this.weight = weight;
				}
			
			

		}


