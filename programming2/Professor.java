package programming2;

import java.io.Serializable;
import java.util.*;

/**
 * The Class Professor.
 * @author junjun
 */
public class Professor implements Serializable {
	private	String fName;
	private String lName;
	private String profID;
	private String department;
	private ArrayList<Course> allCourses = new ArrayList<Course>();
	private ArrayList<Course> curCourses = new ArrayList<Course>();
	 /**
  	 * Creates a new instance of Professor.
  	 *
  	 * @param fName the first name
  	 * @param lName the last name
  	 * @param profID the professor's id
  	 * @param department the department
  	 */
    public Professor(String firstName,String lastName, String profSID, String departmentS){
    	fName=firstName;
    	lName=lastName;
    	profID=profSID;
    	department=departmentS;
    	}
    
    
	/**
	 * Adds the course all courses.
	 *
	 * @param Courses the courses
	 */
	public void addCourseAllCourses(Course Courses){
		allCourses.add(Courses);
	}
	
	/**
	 * Adds the course current courses.
	 *
	 * @param Courses the courses
	 */
	public void addCourseCurCourses(Course Courses)
	{
		curCourses.add(Courses);
	}
	
	/**
	 * Sort all courses by semester.
	 *
	 * @return the array list
	 */
	public void sortAllCourses()
	{
		Comparator<Course> comparator = new ComparatorBySemester();
		Collections.sort(allCourses, comparator);
	}
	
	/**
	 * Sort current courses byID.
	 *
	 * @return the array list
	 */
	public void sortCurCourses()
	{
		Comparator<Course> comparator = new ComparatorByID();
		Collections.sort(curCourses, comparator);
	}
	
	/**
	 * Gets the all courses.
	 *
	 * @return the all courses
	 */
	public ArrayList<String> getAllCourses()
	{
		ArrayList<String> allCourseInfo = new ArrayList<String>();
		for (Course cour : allCourses){
			String info = cour.getCourseName() + " " + cour.getCourseID() + " " +
						cour.getSemSeason() + " " + cour.getSemYear();
			allCourseInfo.add(info);
		}
		return allCourseInfo;
	}
	
	/**
	 * Gets the current courses.
	 *
	 * @return the current courses
	 */
	public ArrayList<String> getCurCourses()
	{
		ArrayList<String> curCourseInfo = new ArrayList<String>();
		for (Course cour : curCourses){
			String info = cour.getCourseName() + " " + cour.getCourseID() + " " +
						cour.getSemSeason() + " " + cour.getSemYear();
			curCourseInfo.add(info);
		}
		return curCourseInfo;
	}
	
	/**
	 * Gets the professor id.
	 *
	 * @return the professor id
	 */
	public String getProfID()
	{
		return profID;
	}
}
