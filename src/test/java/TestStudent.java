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
		assertEquals("Niamh22",student1.getUsername());
	}
	
	public void testCoursesFunctionality() {
		//add courses to test object student
		student1.setCourses("Engineering");

		//test duplication check 
		student1.setCourses("Engineering");
		student1.setCourses("Arts");
		student1.setCourses("Medicine");

		//test expected courses against actual outcome
		assertEquals(courses, student1.getCourses());
	}

	public void testModulesFunctionality() {
		//add modules to test object student 
		student1.setModules("Programming 4");

		//test duplication 
		student1.setModules("Programming 4");
		student1.setModules("Digital Signals Processing");
		student1.setModules("Software Engineering 3");

		//test expected modules against actual outcome
		assertEquals(modules, student1.getModules());
	}
	
	public void testToStringFunctionality() {
		//test expected string against actual outcome
		assertEquals("\nName:Niamh, Username:Niamh22, ID:1234567",student1.toString());
	}
}
	