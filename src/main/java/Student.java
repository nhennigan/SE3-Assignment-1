import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
	
	//declare variables
	private String username;
	private String name;
	private int age;
	private DateTime dob;  
	private int id;
	private ArrayList<String> modules = new ArrayList<String>();
	private ArrayList<String> courses = new ArrayList<String>();

	//constructor method	
	public Student(String name, int age, DateTime dob, int id) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		username = setUsername(name,age);
	}
 
	//setUsername method combines both name and age to get username
	public String setUsername(String name, int age ) {
		return name+age;
	}
	
	//mutator methods
	public void setName(String newName) {name = newName;}
	public void setAge(int newAge) { age = newAge;}
	public void setDob(DateTime newDob) {dob = newDob;}
	public void setId(int newId) {id = newId;}
	
	//checks for duplication and then adds newCourse to course ArrayList
	public void setCourses(String newCourse) {
		if(courses.contains(newCourse)) {
			return;
		}
		else {
		courses.add(newCourse);
		}
	}
	
	//checks for duplication and then adds newModule to module ArrayList
	public void setModules(String newModule) {
		if(modules.contains(newModule)) {
			return;
		}
		else {
		modules.add(newModule);
		}
	}
	
	//accessor methods
	public String getName() {return name;}
	public int getAge() {return age;}
	public DateTime getdob() {return dob;}
	public int getId() {return id;}
	public String getUsername() { return username; }
	public ArrayList<String> getCourses() {return courses;}
	public ArrayList<String> getModules() {return modules;}

	@Override
	public String toString() {
		return("\nName:"+ name + ", Username:" + username + ", ID:" + id );
	}

}