package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {


		HashSet set=new HashSet();
		
		set.add(100);
		set.add("welcome");
		set.add(10.6);
		set.add(null);
		set.add('B');
		
	
		
		System.out.println(set);

ArrayList ls=new ArrayList(set);
ls.add(52);
ls.add(99);

System.out.println(ls);
for(Object x:set)
{
	System.out.println(x);
}

Iterator s=  set.iterator();
while(s.hasNext())
{
	System.out.println(s.next());
	
}

System.out.println(set.size());

set.remove(1);
System.out.println("after remove"+set);

set.removeAll(set);
System.out.println("after remover"+set.isEmpty());
	}

}
