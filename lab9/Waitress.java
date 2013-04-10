package lab9;


import java.util.*;
  
     
public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
 
	public void printMenu() {
		PancakeHouseMenu.PancakeMenuIterator pancakeIterator = pancakeHouseMenu.createIterator();
		DinerMenu.DinerMenuIterator dinerIterator = dinerMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		while (pancakeIterator.hasNext()){
			MenuItem menuItem = pancakeIterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
	}
			
		System.out.println("\nLUNCH");
		while (dinerIterator.hasNext()) {
			MenuItem menuItem = dinerIterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
	}
	}
 
	/*private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}*/
 
	


	
}
