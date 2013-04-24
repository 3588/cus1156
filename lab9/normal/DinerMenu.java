package lab9.normal;


import java.util.NoSuchElementException;

/**
 * The Class DinerMenu.
 */
public class DinerMenu  {

	/** The Constant MAX_ITEMS. */
	static final int MAX_ITEMS = 6;
	
	/** The number of items. */
	private int numberOfItems = 0;
	
	/** The menu items. */
	private MenuItem[] menuItems;
  
	/**
	 * Instantiates a new diner menu.
	 */
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 3.05);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 3.89);
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
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	
	/**
	 * The Class DinerMenuIterator.
	 * @author junjun
	 */
	public class DinerMenuIterator implements MenuIterator {
		
		/** The data. */
		MenuItem[] data;
		
		/** The position. */
		int position = 0;
		
		/**
		 * Instantiates a new diner menu iterator.
		 *
		 * @param data the data
		 */
		public DinerMenuIterator(MenuItem[] data) { 
	        this.data = data; 
	    }
		
		@Override
		public MenuItem next() //return the next item
		{
			if (!hasNext())
	            throw new NoSuchElementException();
			MenuItem nextdata = (MenuItem) data[position]; 
	        position = position + 1; 
	        return nextdata; 
		}

		@Override
		public boolean hasNext() // return true if the next item exists
		{
			   if (position >= data.length ||data[position]==null ) { 
		            return false; 
		        } else { 
		            return true; 
		        } 
		}
		
		@Override
		public void remove()//remove the item at the current iterator position
		{
		    if (position <= 0) { 
	            throw new IllegalStateException 
                ("This is the last one"); 

	        }
	        if (data[position-1] != null) { 
	            for (int i = position-1; i < (data.length-1); i++) { 
	            	data[i] = data[i+1]; 
	            }
	            data[data.length-1] = null; 
	        } 
		}


	}
	
	/**
	 * Creates the iterator.
	 *
	 * @return the diner menu iterator
	 */
	public DinerMenuIterator createIterator() {
		return new DinerMenuIterator(menuItems); 
	}


}
