package demo.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList t=new ArrayList<>();
		t.add("A");
		t.add(10);
		t.add("A");
		t.add(null);
		System.out.println(t);
		
		t.remove(2);
		System.out.println(t);
		
		t.add(2, 'm');
		System.out.println(t);
		t.add('n');
		System.out.println(t);
		

		
	}

}
