package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String, String>tmap=new TreeMap<String, String>();
		tmap.put("c6", "red");
		tmap.put("c2", "blue");
		tmap.put("c3", "green");
		System.out.println(tmap);
		TreeMap<String, String>newtmap=new TreeMap<String, String>();
		newtmap.put("A4", "yellow");
		newtmap.put("A5", "white");
		newtmap.putAll(tmap);
		System.out.println(newtmap);
		for(Map.Entry m:tmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		if(newtmap.containsKey("c4")) {
			System.out.println(newtmap.get("c4"));
		}else {
			System.out.println("no such key");
		}
		System.out.println(newtmap.firstEntry()+" "+newtmap.lastEntry());
		System.out.println(newtmap.firstKey()+" "+newtmap.lastKey());

	}

}
