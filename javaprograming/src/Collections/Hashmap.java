package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Hashmap {

	public static void main(String[] args) {


		HashMap hm=new HashMap();
		
		hm.put(1,"sai");
		hm.put(2, "jyoti");
		hm.put(3, "sudhir");
		hm.put(4, "sarthak");
		hm.put(5, "parvati");
		
		System.out.println(hm.size());
		
	hm.remove(3);
	hm.remove(4);
	System.out.println("after remove:"+hm);
	
	//System.out.println(hm.get(1));
	
//	System.out.println(hm.keySet());
//	System.out.println(hm.values());
//	System.out.println(hm.entrySet());
	
//	for(Object k:hm.keySet())
//	{
//		System.out.println(k+ " "+hm.get(k));
//	}
	
	
//Iterator<Entry<Integer,String>>	it=hm.entrySet().iterator();
//while(it.hasNext())
//{
//	System.out.println(it.next());
//}
//
//HashMap hm1=new HashMap();
//hm1.put(6, "hauri");
//hm1.put(7, "balu");
//
//hm1.putAll(hm);
//System.out.println(hm1);


	
	
	
	}

}
