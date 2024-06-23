package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String >map=new HashMap<Integer,String>();
		map.put(1, "Red");
		map.put(2, "blue");
		map.put(3, "green");
		
		HashMap<Integer,String >newmap=new HashMap<Integer,String>();
		newmap.put(4, "yellow");
		newmap.put(5, "white");
		newmap.put(6, "pink");
		
		newmap.putAll(map);
		System.out.println(map.size());
		for(Map.Entry x:newmap.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		map.clear();
		System.out.println(map);
	}

}
