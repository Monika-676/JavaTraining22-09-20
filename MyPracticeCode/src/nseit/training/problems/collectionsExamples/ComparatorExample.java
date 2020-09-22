package nseit.training.problems.collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product p1 = new Product(1001,"Lg mobile","Electronics");
        Product p2 = new Product(3210,"Raymond Cloth","Clothing");
        Product p3 = new Product(4531,"Cerelac Oats","Provisions");
        ArrayList<Product> ar = new ArrayList<>();
        ar.add(p1);
        ar.add(p2);
        ar.add(p3);
        ProductName pr = new ProductName();
        ProductCat cr = new ProductCat();
        System.out.println("Sorted basis on Product Name.");
        Collections.sort(ar, pr);
        System.out.println(ar);
        System.out.println("Sorted basis on Product Category");
        Collections.sort(ar, cr);
        System.out.println(ar);
        ProductId pi = new ProductId();
        System.out.println("Sorted basis on Product Id : ");
        Collections.sort(ar, pi);
        System.out.println(ar);
        
        
    }

 

}