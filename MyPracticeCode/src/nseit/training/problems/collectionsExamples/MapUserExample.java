package nseit.training.problems.collectionsExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Book implements Comparable<Book>{
    int id;
    String name, author, publisher;
    int quantity;

 

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }



	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.publisher.compareTo(o.publisher) == 0 ) 
			return 0;
		else if(this.publisher.compareTo(o.publisher) < 0)
			return -1;
		else 
			return 1;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
	
}
  
public class MapUserExample {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Map<Integer,Book> map=new HashMap<Integer,Book>();    
            //Creating Books    
            Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
            Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
            Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
            //Adding Books to map  
            
            TreeMap<Book, Integer> tmap = new TreeMap<Book, Integer>();
            tmap.put(b2,1000);
            tmap.put(b1, 999);
            tmap.put(b3, 1001);
             
            map.put(3,b3);  
            map.put(1,b1);  
            map.put(2,b2);   
            //Traversing map  
//            for(Map.Entry<Integer, Book> entry:map.entrySet()){    
//                int key=entry.getKey();  
//                Book b=entry.getValue();  
//                System.out.println(key+" Details:");  
//                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
//            }   
            
            for(Map.Entry<Book, Integer> e: tmap.entrySet()) {
            	Book b = e.getKey();
            	int value = e.getValue();
            	System.out.println(b+" ");
            }

 

    }

 

}
