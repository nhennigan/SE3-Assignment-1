import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {

	private DateTime startDate;
	private DateTime endDate;
	private String name;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<Student> students = new ArrayList<Student>();

	//constructor
	public Course(String name, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	//accessor + mutator methods
	public void setName(String newName) { name = newName; }
	public void setStartDate(DateTime newStartDate) { startDate = newStartDate; }
	public void setEndDate(DateTime newEndDate) { endDate = newEndDate; }

//	public void setStudents(Student newStudent) { students.add(newStudent); }

	public void setModules(Module newModule) { 
		modules.add(newModule); 
		newModule.setCourses(name);
	}

	public String getName() { return name; }
//	public DateTime getStartDate() { return startDate; }
	public DateTime getEndDate() { return endDate; }

	public ArrayList<Module> getModules() {return modules;}
	public ArrayList<Student> getStudents() {return students;}

	public String toString() {
		return("Course name:" + name + "\n");
		//+
	      //      "Start date:" + startDate + "\n" +
	      //      "End date:" + endDate + "\n" +
		//		"Students taking course:" + students + "\n" + 
	     //       "Modules in course:" + modules +"\n");
	}

}