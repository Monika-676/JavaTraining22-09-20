package nseit.training.problems.lamdaExaamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Monika");
		al.add("Sneha");
		al.add("Sayali");
		al.add("Manu");
		al.add("shrutika");
		
//		 al.stream().forEach(s->{
//	         s=s+" Hai";
//	         System.out.println(s);
//	     });
		
		String[] strArray =  al.stream().toArray(String[] :: new);
		System.out.println(strArray);
	    
		Comparator<String> c = (c1,c2)->c1.compareTo(c2);
		
	    String minString = al.stream().min(c).get();
	    String maxString = al.stream().max(c).get();
	    System.out.println("Minimum String:"+minString);
	    System.out.println("Maximum String:"+maxString);
	    al.stream().forEach(System.out::println);
	     
		Predicate<String> s = x -> x.charAt(0) =='S' || x.charAt(0) == 's';
		
		long count =  (long)al.stream().filter(str->str.charAt(0)=='s'|| str.charAt(0) == 'S').count();
		System.out.println(count);
		
		List<String> al2 = al.stream().sorted().filter(s).collect(Collectors.toList());
		System.out.println(al2);
		
	}

}
