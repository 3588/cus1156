package cus1156.lab8.electronics;

/**
 * This class represents one Television object
 * @author Bonnie MacKellar
 *
 */

public class Television extends Electronics {
	public static final double DISCOUNT = 0.8;
    protected int size;
   
    /** Creates a new instance of TV */
    public Television(double regularPrice,
              String manufacturer,
              int size) 
    	{
        super(regularPrice, manufacturer);
        this.size = size;
    }
   
    /** compute the sale price of a Television
     * 
     * @return the sale price
     */
    public double computeSalePrice(){
        return super.getRegularPrice() * DISCOUNT;
    }
}
