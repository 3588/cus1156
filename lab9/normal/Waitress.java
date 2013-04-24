package lab9.normal;


import java.util.*;
  
     
public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
 
	public void printMenu() {
		MenuIterator pancakeIterator = pancakeHouseMenu.createIterator();
		MenuIterator dinerIterator = dinerMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
	/*while (pancakeIterator.hasNext()){
			MenuItem menuItem = pancakeIterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
	}
	*/
			
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		/*while (dinerIterator.hasNext()) {
			MenuItem menuItem = dinerIterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		
	}*/
	}
 
	private void printMenu(MenuIterator pancakeIterator) {
		while (pancakeIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)pancakeIterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
			//pancakeIterator.remove();
		}
	}
 
	


	
}
