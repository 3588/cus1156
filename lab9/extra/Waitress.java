package lab9.extra;


import java.util.*;
  
     
public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
 
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		while (pancakeIterator.hasNext()){
			MenuItem menuItem = (MenuItem) pancakeIterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
	}
			
		System.out.println("\nLUNCH");
		while (dinerIterator.hasNext()) {
			MenuItem menuItem = (MenuItem) dinerIterator.next();
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
