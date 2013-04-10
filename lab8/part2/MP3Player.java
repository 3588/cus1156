package lab8.part2;

/**
 * This class represents one MP3 Player
 * @author Bonnie MacKellar
 *
 */
public class MP3Player extends Electronics{
	public static final double DISCOUNT = 0.9;
    protected String color;
   
    /**
     * create an MP3Player object
     * @param regularPrice
     * @param manufacturer
     * @param color
     */
    public MP3Player(double regularPrice,
                String manufacturer,
                String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }
   
    /** compute the sale price of an Mp3Player object
     * 
     * @return the sale price
     */
    public double computeSalePrice(){
        return super.getRegularPrice() * DISCOUNT;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}