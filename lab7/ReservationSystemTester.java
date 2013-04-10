package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReservationSystemTester {

	static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		Request roster=null;
		FileWriter outFile = null;
		try {
			roster = inputPassengers();
			System.out.println("Do you want to output to the monitor or to a results file? Type M for monitor or F for file");
			String choice = input.nextLine();
			if (choice.equals("M"))
				System.out.println(roster.toString());
			else
			{
				outFile = new FileWriter(new File("report.txt"));
				outFile.write(roster.toString());
				outFile.close();
			}

		} catch (FileNotFoundException e) {
			System.err.println("The input file could not be read");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Plane inputPassengers() throws FileNotFoundException 
	{
		Plane roster = new Plane();
		Scanner fileIn = new Scanner(new File("requests.txt"));
		while (fileIn.hasNextLine())
		{	
			Request request = new Request();
			String line = fileIn.nextLine();
			if (line.equals("end")){
				break;
			}
			else{
				line = fileIn.nextLine();
				int num = Integer.parseInt(line);
				request.setSeatsNeeded(num);
				line = fileIn.nextLine();
				boolean isFirst = line.charAt(0)=='F';
				while(true){
					String[] parts = line.split(" ");
				}
			}
			roster.addRequest(request);
		}
		return roster;
	}
}