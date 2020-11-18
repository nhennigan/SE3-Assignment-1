import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {

	//declare variables
	private DateTime startDate;
	private DateTime endDate;
	private String name;
	private ArrayList<Module> modules = new ArrayList<Module>();
	

	//constructor
	public Course(String name, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	//mutator methods
	public void setName(String newName) { name = newName; }
	public void setStartDate(DateTime newStartDate) { startDate = newStartDate; }
	public void setEndDate(DateTime newEndDate) { endDate = newEndDate; }

	//Add newModule to Course module ArrayList, update newModule's courses ArrayList and update the students taking newModule courses ArrayList
	public void setModules(Module newModule) { 
		modules.add(newModule); 
		newModule.setCourses(name);
		for (Student s: newModule.getStudents()) {
			s.setCourses(name);
		}
	}

	//accessor methods
	public String getName() { return name; }
	public DateTime getEndDate() { return endDate; }
	public ArrayList<Module> getModules() {return modules;}

	@Override
	public String toString() {
		return("Course name:" + name + "\n");
	
	}

}
	
	
	
	