import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTime;
import org.junit.Test;
import junit.framework.TestCase;

public class TestCourse extends TestCase{
	//create objects to test
	private Course course1 = new Course("Engineering", new DateTime(),new DateTime());
	private Module module1 = new Module("Programming 4", 1234);
	private Module module2 = new Module("Software Engineering 3", 5678);
	private Student student1 = new Student("Niamh",22,new DateTime(),1234567);

	@Test
	public void testAddModuleToCourse() {
		//add test modules to course1 test object
		module1.setStudents(student1);
		course1.setModules(module1);
		course1.setModules(module2);
		//create ArrayList for expected outcome of adding modules to course1
		ArrayList<Module> modules = new ArrayList<Module>(Arrays.asList(module1,module2));
		//Test expected against actual outcome of adding modules to course1
		assertEquals(modules, course1.getModules());
	}

	public void testAddCourseNameToModule() {
		//add test modules to course1 test object
		module1.setStudents(student1);
		course1.setModules(module1);
		course1.setModules(module2);
		//create ArrayList for expected outcome of adding the course name to module1's ArrayList of courses
		ArrayList<String> module1Courses = new ArrayList<String>(Arrays.asList("Engineering"));
		//Test expected against actual outcome for adding the course name to module1's ArrayList of courses
		assertEquals(module1Courses,module1.getCourses());
	}

	public void testAddCourseNameToStudents() {
		//add test modules to course1 test object
		module1.setStudents(student1);
		course1.setModules(module1);
		course1.setModules(module2);
		//create ArrayList for expected outcome of adding the course name to students taking module1
		ArrayList<String> student1Courses = new ArrayList<String>(Arrays.asList("Engineering"));
		//Test expected against actual outcome for adding course name to students taking module1
		assertEquals(student1Courses,student1.getCourses());
	}

	public void testToStringFunctionality() {
		//Test expected against actual outcome
		assertEquals("Course name:Engineering\n",course1.toString());
	}
}