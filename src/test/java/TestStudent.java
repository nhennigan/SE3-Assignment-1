import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.Test;

import junit.framework.TestCase;

public class TestStudent extends TestCase{

	//create test objects
	private Student student1 = new Student("Niamh",22,new DateTime(),1234567);
	private ArrayList<String> courses = new ArrayList<String>(Arrays.asList("Engineering","Arts","Medicine"));
	private ArrayList<String> modules = new ArrayList<String>(Arrays.asList("Programming 4","Digital Signals Processing","Software Engineering 3"));
	@Test
	public void testGetUsername() {
	//	Student student1 = new Student("Niamh",22,new DateTime(),1234567);
		assertEquals("Niamh22",student1.getUsername());
	}

	public void testCoursesFunctionality() {
		student1.setCourses("Engineering");
		student1.setCourses("Engineering");
		student1.setCourses("Arts");
		//expected failure
//		assertEquals(courses, student1.getCourses());
		student1.setCourses("Medicine");
		assertEquals(courses, student1.getCourses());
	}

	public void testModulesFunctionality() {
		student1.setModules("Programming 4");
		student1.setModules("Programming 4");
		student1.setModules("Digital Signals Processing");
		//expected failure
//		assertEquals(modules, student1.getModules());
		student1.setModules("Software Engineering 3");
		assertEquals(modules, student1.getModules());
	}

	public void testToStringFunctionality() {
		assertEquals("Niamh\nNiamh22\n1234567",student1.toString());
	}

	public void testToFail() {
		assertEquals("Niamh\nNiamh1234567\n1234567",student1.toString());
		assertEquals("Niamh222222",student1.getUsername());
	}
}