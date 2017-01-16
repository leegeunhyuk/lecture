package com.java.customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("������", "rmsurll");
		Customer c2 = new Customer("�ڰ���", "rmsurl");
		
		HashMap<String, Customer> map = new HashMap<>();
		map.put(c1.getId(), c1);
		map.put(c2.getId(), c2);
		map.put(c1.getId(), c1);
		
		Collection<Customer> coll = map.values();
		Iterator<Customer> it = coll.iterator();
		while(it.hasNext()){
			Customer cus = it.next();
			System.out.println(cus.getName());
		}
		
	}
}