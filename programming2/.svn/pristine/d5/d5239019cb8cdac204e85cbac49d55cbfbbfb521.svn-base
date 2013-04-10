package programming2;

import java.util.Comparator;

/**
 * The ComparatorBySemester class, which implements the Comparator interface.
 * Sorts first by a course's year in the standard direction, then as a secondary
 * sort, sorts by semester in the opposite direction.  Allows an arrayList of
 * courses to be sorted by their semester.
 * @author Patrick Steel
 *
 */
public class ComparatorBySemester implements Comparator<Course>{
	private int directionChange = -1;
	public int compare(Course o1, Course o2) {
		int value1 = o1.semYear.compareTo(o2.semYear);
		if (value1 == 0){
			return directionChange * o1.semSeason.compareTo(o2.semSeason);
		}
		return value1;
	}
}
