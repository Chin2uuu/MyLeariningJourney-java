package bhaichalja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

public class StackDemo {
public static void main(String[] args) {
	//Stackobject,push,pop,empty,search peak:
	Stack<String>s=new Stack();
	s.push("SAtendra");
	s.push(" Kumar");
	s.push("Sadh");
	s.push("Chintu");
	System.out.println(s.empty());//false
	System.out.println(s.pop());//Kumar
	System.out.println(s);//SAtendra
	System.out.println(s.peek());//SAtendra
	System.out.println(s.search("Chintu"));//-1
	System.out.println(s.search(" Kumar"));//1


	ArrayList<String>al=new ArrayList<>();
	al.add("a");
	al.add("b");
	al.add("c");
	al.add("d");
	al.add("e");
	al.add("f");
	al.add("g");
	al.add("h");
	al.add("i");
	al.add("h");
	/*
	 * al.add("a"); al.add("a"); al.add("a"); al.add("a"); al.add("a"); al.add("a");
	 * 
	 * al.add("a"); al.add("a"); al.add("a"); al.add("a");
	 */
	
	
	al.forEach((element)->{System.out.println(element);});
	
	System.out.println("========================================");
	
	Iterator<String>itr=al.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
	
	
/*	
	
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
System.out.println("-----------------------------for each loop");
	for(String s1:al)
	{
		System.out.println(s1);
	}

System.out.println("---------------------------for hastSet");
  	HashSet<String>a1=new HashSet<>();
  	a1.add("satendra");
  	a1.add("kumar");
  	a1.add("mar");
  	a1.add("kumar");
  	a1.add("kur");
  	a1.add("kumar");
  	a1.add("kuma");
  	a1.add("ar");
  	for(String s2:a1) {
  		System.out.println(s2);
  	}

  	System.out.println("---------------------------for LinkedHashSet");
  	LinkedHashSet<String>b1=new LinkedHashSet<>();
  	b1.add("satendra");
  	b1.add("kumar");
  	b1.add("mar");
  	b1.add("kumar");
  	b1.add("kur");
  	b1.add("kumar");
  	b1.add("kuma");
  	b1.add("ar");
  	for(String s2:b1) {
  		System.out.println(s2);
  	}


  	System.out.println("---------------------------for TreeSet");
  	
  	TreeSet<Integer>ts=new TreeSet<>();
  	ts.add(100);
  	ts.add(120);
  	ts.add(22);
  	ts.add(44);
  	ts.add(44);
	ts.add(120);
  	ts.add(22);
  	ts.add(44);
  	ts.add(44);
  	for(Integer i:ts)
  	{
  		System.out.println(i);
  	}

}





}
*/