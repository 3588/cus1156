package lab9.normal;

/**
 * The Interface Lab9Iterator.
 * 
 * @author junjun
 */
public interface  MenuIterator {
	  
  	/**
  	 * Next.
  	 *
  	 * @return the MenuItem
  	 */
	MenuItem next();
	  
  	/**
  	 * Checks for next.
  	 *
  	 * @return true, if successful
  	 */
  	boolean hasNext();
	  
  	/**
  	 * Removes the.
  	 */
  	void remove();
	  
	  /**
	   * useless in lab9
	  void add(Object element);
	  void set(Object element);
	  */
}
