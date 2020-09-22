package nseit.training.problems.lamdaExaamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeN{
	String name;
	String designation;
	int salary;
	
	public EmployeeN(String name, String designation, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
public class EmployeeFilterExample {

	public static void main(String[] args) {

		ArrayList<EmployeeN> al = new ArrayList<EmployeeN>();
		al.add(new EmployeeN("Monika", "SD",1500));
		al.add(new EmployeeN("Sneha", "AI",2000));
		al.add(new EmployeeN("Sanika", "ML",3000));
		al.add(new EmployeeN("Arun", "IT",4000));
		
		//Predicate<EmployeeN> p = e-> e.salary >= 3000;
		//Function<EmployeeN,Integer> m = e->e.salary = e. salary+ 1000;
		Comparator<EmployeeN> c = (emp1,emp2)->emp1.name.compareTo(emp2.name);
	       
        List<EmployeeN> list2 = al.stream().sorted(c).collect(Collectors.toList());
		
		//List<Integer> al3 =  al.stream().map(m).collect(Collectors.toList());
		//System.out.println(al2);
		for(EmployeeN e : list2) {
			System.out.println(e);
		}
	}

}
