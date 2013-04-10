package programming2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * The Interface InitialLoader.
 * @author junjun
 */
public class InitialLoader {
	static University data = new University();
    public static void main(String [] args) throws IOException {
    	loadData();
        exitSystem();
 }
	public static void loadData() throws FileNotFoundException {
		File stu = new File("C:\\program2\\students.txt" );
		File cour = new File("C:\\program2\\courses.txt" );
		File prof = new File("C:\\program2\\professors.txt" );
		data.initialDataLoad(stu, cour, prof);
	}
	public static void exitSystem() {
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