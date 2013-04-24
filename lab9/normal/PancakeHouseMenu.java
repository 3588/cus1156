package lab9.normal;


import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 * The Class PancakeHouseMenu.
 */
public class PancakeHouseMenu  {


	/** The menu items. */
	private ArrayList<MenuItem> menuItems;
 
	/**
	 * Instantiates a new pancake house menu.
	 */
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

	/**
	 * Adds the item.
	 *
	 * @param name the name
	 * @param description the description
	 * @param vegetarian the vegetarian
	 * @param price the price
	 */
	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	/**
	 * The Class PancakeMenuIterator.
	 * @author junjun
	 */
	public class PancakeMenuIterator implements MenuIterator {
		
		/** The data. */
		private ArrayList<MenuItem> data=null;
		
		/** The position. */
		int position = 0;
		
		/**
		 * Instantiates a new pancake menu iterator.
		 *
		 * @param data the data
		 */
		public PancakeMenuIterator(ArrayList<MenuItem> data) { 
	        this.data = data; 
	    }
		
		/* (non-Javadoc)
		 * @see lab9.normal.Lab9Iterator#next()
		 */
		@Override
		public MenuItem next() //return the next item
		{
			if (!hasNext())
	            throw new NoSuchElementException();
			MenuItem nextdata = (MenuItem) data.get(position); 
	        position ++; 
	        return nextdata; 
		}

		/* (non-Javadoc)
		 * @see lab9.normal.Lab9Iterator#hasNext()
		 */
		@Override
		public boolean hasNext() // return true if the next item exists
		{
			   if (position >= data.size()) { 
		            return false; 
		        } else { 
		            return true; 
		        } 
		}

		/* (non-Javadoc)
		 * @see lab9.normal.Lab9Iterator#remove()
		 */
		@Override
		public void remove()//remove the item at the current iterator position
		{
		       if (position <= 0) { 
		            throw new IllegalStateException 
		                ("This is the last one"); 
		       }
		        else{
		            data.remove(position);
		        } 
		}


	}

	/**
	 * Creates the iterator.
	 *
	 * @return the pancake menu iterator
	 */
	public PancakeMenuIterator createIterator() {
		PancakeMenuIterator returnData =  new PancakeMenuIterator(menuItems); 
		return returnData;
	}

}
