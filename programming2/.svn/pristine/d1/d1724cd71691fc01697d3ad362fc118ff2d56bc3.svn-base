package programming2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class FacultyInterface.
 * @author junjun
 */
public class FacultyInterface {
	static University data = new University();
	
	/**
	 * print out.
	 *
	 * @param str the str
	 */
	public static void prt(String str)
	{System.out.print(str);}
	public static void main(String [] args) 
	{
		FacultyInterface professor = new FacultyInterface();
		prt("Enter professor ID\n");
		Scanner input1 = new Scanner(System.in);
		 String professorid=input1.nextLine();
		 if(professor.checkProfID(professorid))
		 {
			 int option=professor.displayFacultyMenu();
			 boolean professornoexit=true;
			 while(professornoexit){
			 switch(option)
			 {
			 case 1:
				 professor.displayCurCourses(professorid);
				 break;
			 case 2:
				 professor.displayAllCourses(professorid);
				 break;
			 case 3:
				 prt("Enter Course ID\n");
				 Scanner input2 = new Scanner(System.in);
				 String courseid=input2.nextLine();
				 professor.displayCourseRoster(professorid, courseid);
				 break;
			 case 4:
				 professor.exitSystem();
				 professornoexit=false;
				 break;
			 default:
				 break;
			 }
			 }
		 }
		 else
			 prt("The professor id didn't find\n");
	}
	public boolean checkProfID(String profID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data.checkProfID(profID);
	}
	public int displayFacultyMenu() {
		while(true)
			{System.out.print("1.Current Courses\n2.All Courses\n3.Course Roster\n4.Exit System\n");
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		if(data>0&&data<5)
			return data;
		else
			System.out.println("Wrong choose!");
			}
}
	public void displayCurCourses( String profID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> info = data.getProfCurCourses(profID);
		for(String data : info)
			System.out.println(data);
	}
	public void displayAllCourses(String profID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> info = data.getProfAllCourses(profID);
		for(String data : info)
			System.out.println(data);
		
	}
	public void displayCourseRoster(String profID,String courseID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> info = data.getCourseRoster(profID,courseID);
		for(String data : info)
			System.out.println(data);
	}
	public void exitSystem() {
		try {
			data.serializeData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(-1);
	}
}


