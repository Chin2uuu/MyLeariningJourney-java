package bhaichalja;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {
			
	 public static void main(String args []) {
		 LinkedList<String>linkedName=new LinkedList<>();
		 linkedName.add("Satnedra");
		 linkedName.add("Kumar");
		 ArrayList e=new ArrayList<>();
		 e.add(10);
		 e.add(20);
		 LinkedList<Integer>l1=new LinkedList<>(e);
		 System.out.println(l1);
		System.out.println( l1.get(1));
		System.out.println(linkedName.getFirst()+" "+linkedName.getLast());
	 }
}
