package nseit.training.problems.lamdaExaamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
	String name;
	int marks;

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class StudentGrade {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		al.add(new Student("Monika", 80));
		al.add(new Student("Anagha", 70));
		al.add(new Student("Rahul", 55));
		al.add(new Student("Amera", 40));

		Function<Student, String> f = (stu) -> {
			if (stu.marks <= 100 && stu.marks > 70)
				return "Distinction";
			else if (stu.marks <= 70 && stu.marks > 60)
				return "First Class";
			else if (stu.marks <= 60 && stu.marks >= 50)
				return "Second Class";
			else
				return "Fail";
		};

		for (Student s : al) {
			System.out.print(s.name + " : ");
			System.out.println(f.apply(s));
		}

	}

}
