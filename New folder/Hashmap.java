import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1,"Chintu");
		hm.put(2,"sonu");
		hm.put(3,"harsh");
		hm.put(4,"ravi");
		hm.put(6,"lubkush");
		hm.put(1,"manshi");
		hm.put(8,"vanshika");
		hm.put(1,"ruhi");
		hm.put(12,"ajay");
		hm.put(44,"david");
		System.out.println(hm);
		
		Collection c=hm.values();
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			
		System.out.println(itr.next());	
			
		}
		
		System.out.println("Using Entry Set:");
		Set<Integer> s=hm.keySet();
		
		for(Integer i:s) {
			System.out.println("key "+i+"values "+hm.get(i));
		}
		Set<Map.Entry<Integer,String>>entrySet=hm.entrySet();
		
		for(Map.Entry<Integer, String> entry:entrySet) {
			System.out.println("values "+entry.getValue()+" key "+entry.getKey());
		}
		
		
		
		
		
	}

}
