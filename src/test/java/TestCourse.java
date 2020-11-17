import static org.junit.Assert.*;

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

	@Test
	public void testModuleFunctionality() {
		//add test modules to course1 test object
		course1.setModules(module1);
		course1.setModules(module2);
		//create ArrayList for expected outcome
		ArrayList<Module> modules = new ArrayList<Module>(Arrays.asList(module1,module2));
		//Test expected against actual outcome
		assertEquals(modules, course1.getModules());
	}

	public void testToStringFunctionality() {
		//Test expected against actual outcome
		assertEquals("Course name:Engineering\n",course1.toString());
	}
}