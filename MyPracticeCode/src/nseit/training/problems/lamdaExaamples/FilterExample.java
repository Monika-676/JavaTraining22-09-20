package nseit.training.problems.lamdaExaamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String aargs[]) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<=10;i++)
            ar.add(i);
        Stream stream1 = ar.stream();
        Predicate<Integer> p = n->n%2==0;
       
     List<Integer> list1=    (List<Integer>) stream1.filter(p).collect( Collectors.toList() );
     System.out.println(ar);
     System.out.println(list1);
    
     Stream stream2 = ar.stream();
     Function<Integer,Integer> f = x->x+3;
     List<Integer> list2 =     (List<Integer>) stream2.map(f).collect(Collectors.toList());
     System.out.println(list2);
       
    }
}
