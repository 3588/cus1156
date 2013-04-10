package programming2;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The Class test.
 * @author junjun
 */
public class test {
	
	/**
	 * printout.
	 *
	 * @param str the str
	 */
	public static void prt(String str)
	{System.out.print(str);}
	 
 	/**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
	public static void main(String args[])
	 {	 
		 boolean noexit=true;
		 while(noexit)
		 {
			 prt("1.initialize\n2.Student Menu\n3.professor Menu\n4.Exit\n");
			 Scanner input1 = new Scanner(System.in);
			 int option = input1.nextInt();
			 switch(option)
			 {
			 case 1:
				 Initial initial = new Initial();
				 try {
					 initial.loadData();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				 initial.exitSystem();
				 break;
			 case 2: //Student Menu
				 StudentUI student= new StudentUI();
				 prt("Enter Student ID\n");
				 Scanner input2 = new Scanner(System.in);
				 String studentid=input2.nextLine();
				 if(student.checkStudentID(studentid))
				 {
					 boolean studentnoexit=true;
					 while(studentnoexit){
					 option=student.displayStudentMenu();
					 switch(option)
					 {
					 case 1:
						 prt("Enter Course ID\n");
						 Scanner input3 = new Scanner(System.in);
						 String courseid=input3.nextLine();
						 student.registerForCourse(studentid, courseid);
						 break;
					 case 2:
						 prt("Enter Course ID\n");
						 Scanner input4 = new Scanner(System.in);
						 courseid=input4.nextLine();
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
				 break;
			 case 3: //professor Menu
				 Faculty professor= new Faculty();
				 prt("Enter professor ID\n");
				 Scanner input5 = new Scanner(System.in);
				 String professorid=input5.nextLine();
				 if(professor.checkProfID(professorid))
				 {
					 option=professor.displayFacultyMenu();
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
						 Scanner input6 = new Scanner(System.in);
						 String courseid=input6.nextLine();
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
				 break;
			 case 4:
				 noexit = false;
				 break;
				 default:
					 break;
			 }

		 }
	 }
}
