package basics;

public class Employee {
	
	
	// Example of a Java bean class
	private String Name;
	private int Eid;
	private double salary;
	
	Employee(String Name, int id, double salary){
		this.Name = Name;
		Eid = id;
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	public double setSalary(double Salary) {
//		this.salary = Salary;
//		return this.salary;
//	}
	
	
}
