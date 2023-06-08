import java.util.ArrayList;
import java.util.Collections;

public class CollectionFillMethod {

	
	
	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("bbb");
		mylist.add("aaa");
		mylist.add("eee");
		mylist.add("ccc");
		System.out.println("Original List : " + mylist);
		
		Collections.fill(mylist, "ZZZ");
		
		System.out.println("After fill List : " + mylist);
	}
	
	
	
	
}
