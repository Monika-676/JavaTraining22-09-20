package nseit.training.problems.collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {

		LinkedList<String> ar = new LinkedList<>();
		ar.add("India");
		ar.add("Japan");
		ar.add("America");
		//ar.add(null);
		ar.add("Africa");
		
	
		Collections.sort(ar);
		Iterator<String> itr = ar.iterator();
		while(itr.hasNext())
			System.out.println(itr.next()+ " ");
		
		
		ArrayList<Employe> al = new ArrayList<>();
		al.add(new Employe("Monika", 101));
		al.add(new Employe("Samiksha", 102));
		al.add(new Employe("Aakansha", 103));
		al.add(new Employe("Shreya", 104));
		al.add(new Employe("Sourabh", 105));
		
		Collections.sort(al);
		
		Iterator<Employe> itr1 = al.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next()+ " ");
		

		
	}

}
