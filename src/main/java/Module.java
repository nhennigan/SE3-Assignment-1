import java.util.ArrayList;
public class Module {
	
	//declare varaibles
	public String name;
	public int id;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<String> courses = new ArrayList<String>();
	
	//constructor method
	public Module(String name, int id) {
		this.name = name;
		this.id = id;
	}
	//Mutator methods
	public void setName(String newName) {name = newName;}
	public void setId(int newId) {id = newId;}
	public void setCourses(String newCourse) {courses.add(newCourse);}
	
	//add newStudent to students ArrayList and update newStudents modules ArrayList
	public void setStudents(Student newStudent) {
		if (students.contains(newStudent)) {
			return;
		}
		else {
			students.add(newStudent);
			newStudent.setModules(name);
		}
	}
	
	//Accessor methods
	public String getName() {return name;}
	public int getId() {return id;}
	public ArrayList<Student> getStudents() {return students;}
	public ArrayList<String> getCourses() {return courses;}

	@Override
	public String toString() {
		return("\nModule name:" + name + ", Module ID:" + id);
	}
}