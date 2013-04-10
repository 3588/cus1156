package lab8.part2;

import java.util.ArrayList;

public class PriceComputer
	{
		private static final double TAX_RATE = 0.05;

		public static void main(String[] args) {

				// Declare and create Product array of size 5
				ArrayList<Product> products = new ArrayList<Product>();

				// Create object instances and assign them to
				// the type of Product.
				products.add(new Television(1000, "Samsung", 30));
				products.add(new Television(2000, "Sony", 50));
				products.add(new MP3Player(250, "Apple", "blue"));
				products.add(new Book(34, "Sun press", 1992));
				products.add(new Book(15, "Korea press", 1986));

				double totalSalePrice = 0;
                int itemNum = 1;
				for (Product product : products)
				{
					double priceWithTax = computeTax(product);
					System.out.println("Item number " + itemNum +
                    " Type = " + product.getClass().getName() + ":");
	                System.out.printf("The sale price with tax is $%.2f\n\n", priceWithTax);
	                totalSalePrice = totalSalePrice + priceWithTax;
	                itemNum++;
				}
			
				System.out.printf("totalSalePrice = $%.2f\n", totalSalePrice);
		}

		private static double computeTax(Product product)
			{
				double price = product.computeSalePrice();
				return price + (price * TAX_RATE);
			}


}
