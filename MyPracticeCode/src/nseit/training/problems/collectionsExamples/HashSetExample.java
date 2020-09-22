package nseit.training.problems.collectionsExamples;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample{

	public static void main(String[] args) {

		HashSet<Employe> hs = new HashSet<>();
		hs.add(new Employe("Monika", 101));
		hs.add(new Employe("Samiksha", 102));
		hs.add(new Employe("Ankansha", 103));
		hs.add(new Employe("Shreya", 104));
		hs.add(new Employe("Sourabh", 105));
		hs.add(null);
		
		for(Employe e : hs) {
			System.out.println(e+" ");
		}
		
		System.out.println("Using Emp Name sorting : ");
		TreeSet<Employe> ts = new TreeSet<>();
		ts.add(new Employe("Monika", 101));
		ts.add(new Employe("Samiksha", 102));
		ts.add(new Employe("Ankansha", 103));
		ts.add(new Employe("Shreya", 104));
		ts.add(new Employe("Sourabh", 105));
		
		for(Employe e : ts)
			System.out.println(e+" ");
			
	}

	 

	}
	


