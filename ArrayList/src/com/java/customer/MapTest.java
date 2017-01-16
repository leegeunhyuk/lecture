package com.java.customer;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("진강사", "rmsurll");
		Customer c2 = new Customer("박강사", "rmsurl");
		
		HashMap<String, Customer> map = new HashMap<>();
		map.put(c1.getId(), c1);
		map.put(c2.getId(), c2);
		map.put(c1.getId(), c1);
//		System.out.println(map.size());
//		
		System.out.println(map.get(c1.getId()).getName());
	}
}
