package nseit.training.problems.lamdaExaamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;


class Employee{
	String name;
	Double salary;
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class PreDefinedFunctionalInterfaces {

	public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<>();
		al.add(new Employee("Monika", 1000.0));
		al.add(new Employee("Samiksha", 2000.0));
		al.add(new Employee("Anagha", 100.0));
		
		BiConsumer<Employee, Double> bf = (emp, bonus) -> emp.salary = emp.salary + bonus;
		
		for(Employee e : al) {
			bf.accept(e, 1000.0);
		}
		
		 for(Employee e: al) {
	            System.out.println(e);
	       }

	}

}
