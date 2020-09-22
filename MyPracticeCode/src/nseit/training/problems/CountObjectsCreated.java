package nseit.training.problems;

public class CountObjectsCreated {
	static int count = 0;
	CountObjectsCreated(){
		count++;
	}

	public static void main(String[] args) {
		CountObjectsCreated obj1;
		CountObjectsCreated obj2 = new CountObjectsCreated();
		CountObjectsCreated obj3 = new CountObjectsCreated();
		CountObjectsCreated obj4 = new CountObjectsCreated();
		System.out.println("No. of Objects created are : "+ count);
	}

}
