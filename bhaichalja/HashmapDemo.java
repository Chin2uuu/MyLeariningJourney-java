package bhaichalja;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {
	
	public static void main(String[] args) {
		//hashMap CREATE	(INTEGER,String)
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1,"chintu");
		hm.put(2, "Sonu");
		hm.put(3, "harsh");
		hm.put(4, "Satendra");
		hm.put(5, "Ravi");
		hm.put(1, "luvkush");//lukush is overwrited at 1 key ;
		System.out.println(hm);
		System.out.println(hm.size());//5
		System.out.println(hm.containsKey(6));//false
		System.out.println(hm.isEmpty());//false
		System.out.println(hm.containsValue("ravi"));//false
		System.out.println(hm.get(5));
		Collection c=hm.values();
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set<Integer>s=hm.keySet();
		for(Integer i:s) {
			System.out.println("key:"+i+"value"+hm.get(i));
		}
		
	}
}
