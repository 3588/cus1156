package lab9;


import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu  {
	private ArrayList<MenuItem> menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs, and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries, and blueberry syrup",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	
	//part 3
	class createIterator
	{
		private ArrayList<MenuItem> position;
	    private ArrayList<MenuItem> previous;
	    
	    public createIterator()
	    {
	    	position = null;
	    	previous = null;
	    }
	    
	      
	public ArrayList<MenuItem> next()
	{   
		if (!hasNext())
        throw new NoSuchElementException();
     previous = position; // Remember for remove

     if (position == null)
        position = menuItems;
     else
        position = position.next;

     return position.data;
		return null;
		
	}
	public boolean hasNext()
	{
		if (position == null)
	            return menuItems != null;
	         else
	            return position.next != null;
		return true;
	}
	public void remove()
	{
		
	}
	}
}
