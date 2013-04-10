package programming2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The user interface for Student.
 * @author junjun
 */
public class StudentInterface {
	static University data = new University();
	/**
	 * print out.
	 *
	 * @param str the str
	 */
	public static void prt(String str)
	{System.out.print(str);}
	  public static void main(String [] args){
		  StudentInterface student = new StudentInterface();
		  prt("Enter Student ID\n");
			 Scanner input1 = new Scanner(System.in);
			 String studentid=input1.nextLine();
			 if(student.checkStudentID(studentid))
			 {
				 boolean studentnoexit=true;
				 while(studentnoexit){
				 int option=student.displayStudentMenu();
				 switch(option)
				 {
				 case 1:
					 prt("Enter Course ID\n");
					 Scanner input2 = new Scanner(System.in);
					 String courseid=input2.nextLine();
					 student.registerForCourse(studentid, courseid);
					 break;
				 case 2:
					 prt("Enter Course ID\n");
					 Scanner input3 = new Scanner(System.in);
					 courseid=input3.nextLine();
					 student.dropCourse(studentid, courseid);
					 break;
				 case 3:
					 student.displayCurCourses(studentid);
					 break;
				 case 4:
					 student.displayAllCourses(studentid);
					 break;
				 case 5:
					 student.exitSystem();
					 studentnoexit=false;
					 break;
				 default:
					 break;
				 }
				 }
			 }
			 else
				 prt("The student id didn't find\n");
   }
	public static boolean checkStudentID(String studentID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data.checkStudentID(studentID);
	}

	public static int displayStudentMenu() {
		while(true)
		{
		System.out.print("1.Register Course\n2.Drop Course\n3.Display CurCourses\n4.Display All Courses\n5.Exit System\n");
	Scanner input = new Scanner(System.in);
	int data = input.nextInt();
	if(data>0&&data<6)
		return data;
	else
		System.out.println("Wrong choose!");
		}
	}

	public static void registerForCourse(String studentID, String courseID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("register course "+courseID+"\n");
		data.registerForCourse(studentID, courseID);
		System.out.print("Your all courses after register course\n"+data.getStudentAllCourses(studentID)+"\n");
		try {
			data.serializeData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void dropCourse(String studentID, String courseID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("Drop course "+courseID+"\n");
		data.dropCourseCurSemester(studentID, courseID);
		System.out.print("Your all Courses after drop course\n"+data.getStudentAllCourses(studentID)+"\n");
		
		try {
			data.serializeData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void displayCurCourses(String studentID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> info = data.getStudentCurCourses(studentID);
		for(String data : info)
			System.out.println(data);
	}

	public static void displayAllCourses(String studentID) {
		try {
			data.regularDataLoad();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> info = data.getStudentAllCourses(studentID);
		for(String data : info)
			System.out.println(data);
	}

	public static void exitSystem() {
		try {
			data.serializeData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(-1);
	}

	}
