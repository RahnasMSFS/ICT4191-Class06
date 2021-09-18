package lk.ac.vau.Model;

public class Student extends PrimaryId<String>{
  
	private String Name;
	private int Age;
	private String Degree;
	private double GPA;
	
	public Student()
	{}

	public Student(String id,String name, int age, String degree, double gPA) {
		super(id);
		Name = name;
		Age = age;
		Degree = degree;
		GPA = gPA;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
}
