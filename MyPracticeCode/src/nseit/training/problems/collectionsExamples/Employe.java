package nseit.training.problems.collectionsExamples;

public class Employe implements Comparable<Employe>{
	
	String EmpName;
	int id;		

	public Employe(String empName, int id) {
		super();
		EmpName = empName;
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "[EmpName=" + getEmpName() + "]";
	}
	

	@Override
	public int compareTo(Employe o) {
		if(this.EmpName.compareTo(o.getEmpName())==0)
            return 0;
    else if(this.EmpName.compareTo(o.getEmpName())>0)
        return 1;
    else
        return -1;
	}

//	public static void main(String[] args) {
//
//		LinkedList<Employe> ar = new LinkedList<>();
//		ar.add(new Employe("Monika", 101));
//		ar.add(new Employe("Samiksha", 102));
//		ar.add(new Employe("Aankasha", 103));
//		ar.add(new Employe("Shreya", 104));
//		ar.add(new Employe("Sourabh", 105));
//		ar.add(null);
//		//System.out.println(ar);
//		for(Employe index : ar) {
//			System.out.println(index);
//		}
//		
//		Iterator<Employe> itr = ar.iterator();
//		
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		System.out.println(ar);
//	}

}
