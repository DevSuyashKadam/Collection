package com.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  HashMap m=new HashMap<>();
		IdentityHashMap m=new IdentityHashMap<>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1, "pavan");
		m.put(i2, "kalyan");
		System.out.println(m);
		
		
		System.out.println(m.get(10));
		
	}

}
