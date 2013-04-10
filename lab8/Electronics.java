package cus1156.lab8.electronics;

/**
 * This class represents an Electronics object
 * @author Bonnie MacKellar
 *
 */
public class Electronics extends Product{
   
    protected String manufacturer;
   
    /** Creates a new instance of Electronics */
    public Electronics(double regularPrice,
            String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }
   
    public String getManufacturer() {
        return manufacturer;
    }
   
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
   
}