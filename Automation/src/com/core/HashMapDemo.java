package com.core;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(101, "Name 1");
		hm.put(103, "Name 3");
		hm.put(106, "Name 6");
		hm.put(111, "Name 111");
		hm.put(123, "Name 123");
		
		System.out.println(hm);
		hm.put(233, "Name 233");
		System.out.println(hm);
		
		ArrayList tr = new ArrayList<>();
		tr.add(3000);
		tr.add(6000);
		tr.add(9000);
		HashMap<Integer, ArrayList> hm1 = new HashMap();
		hm1.put(222, tr);
		System.out.println(hm1);
 		
	}
}
