package lab8.part2;

/**
 * This class represents one Book
 * @author Bonnie MacKellar
 *
 */
public class Book extends Product{
	public static final double DISCOUNT = 0.5;
	   
    protected String publisher;
    protected int yearPublished;
   
    /** Creates a new instance of Book */
    public Book(double regularPrice,String publisher, int yearPublished) 
    	{
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
   
    /** compute the sale price of a Book
     * 
     * @return the sale price
     */
    public double computeSalePrice(){
        return super.getRegularPrice() * DISCOUNT;
    }
   
    public String getPublisher() {
        return publisher;
    }
   
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
   
    public int getYearPublished() {
        return yearPublished;
    }
   
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
   
}
