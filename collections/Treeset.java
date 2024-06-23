package com.collections;

import java.util.Iterator;
import java.util.TreeSet;



public class Treeset {

	public static void main(String[] args) {
		TreeSet<String>Treedata=new TreeSet<String>();
		Treedata.add("red");
		Treedata.add("blue");
		Treedata.add("green");
		
       System.out.println(Treedata);
       System.out.println(Treedata.first());
       System.out.println(Treedata.last());
       System.out.println(Treedata.getFirst());
       
     //printing elements through iteration
       Iterator<String>it=Treedata.descendingIterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       TreeSet<String>newTreedata=new TreeSet<String>(Treedata);
       System.out.println(newTreedata);
       
       TreeSet<String>newTree=new TreeSet<String>();
       newTree.add("yellow");
       newTree.add("white");
       newTree.add("pink");
       System.out.println(newTree);
       Treedata.addAll(newTree);
       System.out.println(Treedata);
       System.out.println(Treedata.pollFirst());
       
       Treedata.pollLast();
       System.out.println(Treedata);
       
       TreeSet<Integer>ele=new TreeSet<Integer>();
		ele.add(8);
		ele.add(9);
		ele.add(7);
		ele.add(5);
		ele.add(3);
		ele.add(11);
		for(int i:ele) {
			if(i<7) {
				System.out.println(i);
			}
		}
		System.out.println(ele.headSet(9));
		System.out.println(ele.ceiling(10));
		System.out.println(ele.floor(10));
		System.out.println(ele.higher(10));
	}
	
	

}
