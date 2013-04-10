package lab7;

import java.util.ArrayList;


public class Plane {

	ArrayList<Request> AirplaneSeats = new ArrayList<Request>();

	public void addRequest (Request request)
	{
		AirplaneSeats.add(request);
	}
	public String ToString()
	{
		String output = "The passengers: \n";
		for (Request request : AirplaneSeats)
			output = output + request.toString();
		return output;
	}
	public boolean isRowTaken()
	{
		if (AirplaneSeats.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
