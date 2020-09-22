package nseit.training.problems.lamdaExaamples;

import java.util.function.Predicate;

public class LogicalPredicate {

	public static void main(String[] args) {

		Predicate<Integer> p1 = x->x>=10;
        Predicate<Integer> p2 = x->x%2==0;
        
        
         System.out.println("Is 2> 10 or even: "+ p1.or(p2).test(20));
         System.out.println("Is 2> 10 or even: "+ p1.and(p2).test(20));
         System.out.println("Direct predicate is :" +p1.test(10));
         System.out.println("Negation is :"+p1.negate().test(9));
	}

}
