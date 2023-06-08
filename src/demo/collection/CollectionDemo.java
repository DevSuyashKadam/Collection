package demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList l=new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		System.out.println(l);
		
		
		Collections.sort(l,new MyComparator() );
		System.out.println(l);
	}

}
 
	class MyComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String s1=(String)o1;
			String s2=o2.toString();
			return s2.compareTo(s1);
			
			
		}
		
	}