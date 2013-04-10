package programming2;

import java.io.Serializable;
import java.util.*;

/**
 * The Course class, one of three main informational classes of this project.  Holds information
 * regarding courses, including which professor teaches the course, as well as a class roster
 * of students, who are taking the course.
 * @author Patrick Steel
 *
 */
public class Course implements Serializable{
	private String courseName;
	public String courseID;
	private String profID;
	private int enrollmentCap;
	private int curAmountEnrolled = 0;
	public String semSeason;
	public String semYear;
	ArrayList<String> studentInfo = new ArrayList<String>();
	
	/**
	 * Simple constructor for the Course class, setting the information right as the
	 * class is created to limit unnecessary method creation.
	 * @param name
	 * @param ID
	 * @param proID
	 * @param enrollCap
	 * @param season
	 * @param year
	 */
	public Course(String name, String ID, String proID, String enrollCap, String season, String year){
		courseName = name;
		courseID = ID;
		profID = proID;
		enrollmentCap = Integer.parseInt(enrollCap);
		semSeason = season;
		semYear = year;
	}
	
	/**
	 * Adds a String of studentInfo to the course, provided that the course as yet to
	 * hit the pre-set enrollment cap.  Also increases the amount of currently enrolled
	 * students in the course.
	 * @param studInfo
	 */
	public void addStudent(String studInfo){
		if(!(curAmountEnrolled==enrollmentCap)){
			studentInfo.add(studInfo);
			curAmountEnrolled++;
		}
		else
			System.out.println("Course enrollment full! Cannot register for this course!");
	}
	
	/**
	 * Drops a specific student from the course roster, which also brings the number
	 * of students currently enrolled down by one.
	 * @param studInfo
	 */
	public void dropStudent(String studInfo){
		int index1 = -1;
		for(String info : studentInfo){
			if(studInfo.equals(info)){
				index1 = studentInfo.indexOf(info);
			}
		}
		studentInfo.remove(index1);
		curAmountEnrolled--;
	}
	
	/**
	 * Returns the arrayList of studentInfo, also known as the class roster.
	 * @return
	 */
	public ArrayList<String> getCourseRoster(){
		return studentInfo;
	}
	
	/**
	 * Returns the course's ID.
	 * @return
	 */
	public String getCourseID(){
		return courseID;
	}
	
	/**
	 * Returns the course's Name.
	 * @return
	 */
	public String getCourseName(){
		return courseName;
	}
	
	/**
	 * Returns the season of a course.
	 * @return
	 */
	public String getSemSeason(){
		return semSeason;
	}
	
	/**
	 * Returns the year of the course.
	 * @return
	 */
	public String getSemYear(){
		return semYear;
	}
	
	/**
	 * Returns the professor ID of the professor who is teaching the course.
	 * @return
	 */
	public String getProfID(){
		return profID;
	}
	
	/**
	 * Returns the number of empty spots in the course, determined by the different
	 * between the course's enrollment cap and the amount of students currently enrolled.
	 * @return
	 */
	public int getEmptySpots(){
		return enrollmentCap-curAmountEnrolled;
	}
}
