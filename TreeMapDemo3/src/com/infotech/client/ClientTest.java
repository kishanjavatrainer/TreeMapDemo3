package com.infotech.client;

import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.infotech.model.PhoneModel;

public class ClientTest {

	public static void main(String[] args) {
		
		TreeMap<PhoneModel,String> map = new TreeMap<>();
		
		map.put(new PhoneModel("Samsung Galaxy On7 Pro", 6990.0), "Samsung");
		map.put(new PhoneModel("Samsung Galaxy J7 Pro", 17800.0), "Samsung");
		map.put(new PhoneModel("Samsung Galaxy Note 8", 67900.0), "Samsung");
		map.put(new PhoneModel("Samsung Galaxy A7 ", 20990.0), "Samsung");
		
		map.put(new PhoneModel("Apple iPhone 6S", 53990.0), "iPhone");
		map.put(new PhoneModel("Apple iPhone 8 Plus", 64999.00), "iPhone");
		map.put(new PhoneModel("Apple iPhone 5", 13999.0), "iPhone");
		
		Set<Entry<PhoneModel, String>> entrySet = map.entrySet();
		for (Entry<PhoneModel, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------Get First and Last Entry----------");
		
		System.out.println("firstEntry:"+map.firstEntry());
		System.out.println("lastEntry:"+map.lastEntry());
		
		System.out.println("--------------Get subMap----------");
		SortedMap<PhoneModel, String> subMap = map.subMap(new PhoneModel("Samsung Galaxy A7 ", 20990.0), new PhoneModel("Samsung Galaxy Note 8", 67900.0));
		Set<Entry<PhoneModel, String>> entrySet2 = subMap.entrySet();
		for (Entry<PhoneModel, String> entry : entrySet2) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("Check specific key is present or not::::");
		System.out.println(map.containsKey(new PhoneModel("Samsung Galaxy On7 Pro", 6990.0)));
	}
}
