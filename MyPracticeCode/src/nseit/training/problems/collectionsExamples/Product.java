package nseit.training.problems.collectionsExamples;

import java.util.Comparator;

public class Product {
	int id;
	String name;
	String category;
	
	public Product(int id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + "]";
	}

}

class ProductName implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        // TODO Auto-generated method stub
        
        if(p1.getName().compareTo(p2.getName())<1)
            return -1;
        else if(p1.getName().compareTo(p2.getName())>1)
            return 1;
        else
            return 0;
    }
    
}

class ProductId implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        // TODO Auto-generated method stub
        
        if(p1.getId() < p2.getId())
            return 1;
        else if(p1.getId() > p2.getId())
            return -1;
        else
            return 0;
    }
    //can't use compareTo() method because in case of collections it works only for wrapper class objects.
    //That's why in above class i didn't use comparTo() method
}
class ProductCat implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        // TODO Auto-generated method stub
       
        if(p1.getCategory().compareTo(p2.getCategory())<1)
            return -1;
        else if(p1.getCategory().compareTo(p2.getCategory())>1)
            return 1;
        else
            return 0;
    }
}