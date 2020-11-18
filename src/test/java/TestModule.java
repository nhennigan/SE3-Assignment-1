import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTime;
import org.junit.Test;
import junit.framework.TestCase;
public class TestModule extends TestCase {
	//create objects to test
	private Module module1 = new Module("Programming 4", 1234);
	private Student student1 = new Student("Niamh",22,new DateTime(),1234567);
	private Student student2 = new Student("Mary",21,new DateTime(),3456789);
	
	@Test
	public void testToStringFunctionality() {
		//Test expected against actual outcome
		assertEquals("\nModule name:Programming 4, Module ID:1234",module1.toString());
	}
	
	public void testAddStudentsToModule() {
		//add students to test object module1
		module1.setStudents(student1);
		module1.setStudents(student2);

		//create ArrayList of expected list of students
		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(student1,student2));

		//test expected list of students with actual outcome
		assertEquals(students,module1.getStudents());
	}

	public void testAddModuleNameToStudent() {
		//add student to test object module 
		module1.setStudents(student1);

		//create ArrayList of student1's modules
		ArrayList<String> student1Modules= new ArrayList<String>(Arrays.asList("Programming 4"));

		//test expected list of student1's modules with actual outcome
		assertEquals(student1Modules,student1.getModules());
	}
	public void testCoursesFunctionality() {
		//add test courses to test object module1
		module1.setCourses("Engineering");
		module1.setCourses("Arts");
		module1.setCourses("Medicine");

		//create ArrayList with expected list of courses 
		ArrayList<String> courses = new ArrayList<String>(Arrays.asList("Engineering","Arts","Medicine"));

		//test expected against actual outcome
		assertEquals(courses,module1.getCourses());
	}
}