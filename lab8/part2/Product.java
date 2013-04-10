package lab8.part2;

/**
 * This class represents a Product
 * @author Bonnie MacKellar
 *
 */
public class Product {
   
    protected double regularPrice;
   
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }


	public double computeSalePrice() {
		// TODO Auto-generated method stub
		return 0;
	}





   
}