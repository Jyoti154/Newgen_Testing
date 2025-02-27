package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class map2 {

	public static void main(String[] args) {

HashMap<Integer,String> mp=new HashMap<Integer,String>();
mp.put(101, "jyoti");
mp.put(102, "arati");
mp.put(103, "balaji");
mp.put(104, "swapnil");
mp.put(105, "sudhir");

System.out.println(mp.size());
		
		mp.remove(101);
		System.out.println("after remove"+mp);
		
		System.out.println(mp.get(102));
		
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());
		
		for(Object k:mp.keySet())
		{
			System.out.println(k+ " "+mp.get(k));
		}
		
	Iterator<Entry<Integer,String>>it=	mp.entrySet().iterator();
	while(it.hasNext())
	{
it.next();
	}

	}

}
