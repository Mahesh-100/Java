package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hash {

	public static void main(String[] args) {
		
		
		HashSet<String>data=new HashSet<String>();
		data.add("mahesh");
		data.add("suresh");
		data.add("ramesh");
		data.add("ganesh");
		data.add("yugesh");
		//data.add(null);
		
		System.out.println(data);
		HashSet<String>copy=new HashSet<String>();
		copy=(HashSet<String>)data.clone();
		copy.add("dinesh");
		System.out.println(copy);
		data.remove("suresh");
		data.removeAll(data);
		
		for(String st:copy) {
			System.out.println(data.contains(st)?"yes":"no");
		}
		Iterator<String>it=data.iterator();
		
		String[] str=new String[data.size()];
		System.out.println("the array: ");
	
		//Traditonal approach
		for(int i=0;i<str.length;i++) {
		while(it.hasNext()) {
			str[i]=it.next();
			System.out.println(str[i]);
		}
		}
		
		data.toArray(str);
		System.out.println("Array elements:");
		for(String st:str) {
			System.out.println(st);
		}
		Iterator<String>itc=data.iterator();
		while(itc.hasNext()) {
			
			System.out.println(itc.next());
		}
		
		System.out.println(data.isEmpty());
		System.out.println("size "+data.contains("mahesh"));
		
		TreeSet<String>Tdata=new TreeSet<String>(data);
		while(it.hasNext()) {
			Tdata.add(it.next());
		}
		System.out.println("Tree set data");
		System.out.println(Tdata);
		
		
	}
	

}
