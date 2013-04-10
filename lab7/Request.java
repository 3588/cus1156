//represents a record for one request
package lab7;
import java.util.ArrayList;

public class Request {
	public int SeatsNeeded;
	public boolean FirstClass;  
	private ArrayList<String> fNames = new ArrayList<String>();
	private ArrayList<String> lNames = new ArrayList<String>();
	private ArrayList<String> Nations = new ArrayList<String>();
	private ArrayList<String> FFNS = new ArrayList<String>();
	public boolean Accepted;

	public void addfName(String a)
	{
		fNames.add(a);
	}
	public void addlName(String b)
	{
		lNames.add(b);
	}
	public void addNation(String c)
	{
		Nations.add(c);
	}
	public void addFFN(String d)
	{
		FFNS.add(d);
	}

	public Request(){
		setSeatsNeeded(0);
		FirstClass = false;
	}

	public Request(String[] fNames, String[] lNames, String[] Nations, String[] FreqFly){
		setSeatsNeeded(fNames.length);
		for (int i = 0; i<fNames.length; i++)
		{
			this.fNames.add(fNames[i]);
			this.lNames.add(lNames[i]);
			this.Nations.add(Nations[i]);
			this.FFNS.add(FreqFly[i]);
		}
	}

	public String toString()
	{
		String output = SeatsNeeded + " " + lNames.toString() + FirstClass + " ";

		return output;
	}

	public int getSeatsNeeded() {
		return SeatsNeeded;
	}
	public void setSeatsNeeded(int seatsNeeded) {
		SeatsNeeded = seatsNeeded;
	}
	public boolean getFirstClass() {
		return FirstClass;
	}
	public void setFirstClass(boolean firstClass) {
		FirstClass = firstClass;
	}
	public boolean getAccepted() {
		return Accepted;
	}
	public void setAccepted(boolean accepted) {
		Accepted = accepted;
	}
}

