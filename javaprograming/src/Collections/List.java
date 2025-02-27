package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {


		ArrayList list=new ArrayList();

		
		list.add(100);
		list.add("welcome");
		list.add("true");
		list.add(10.6);
		list.add(null);
		list.add('A');
		list.add(null);
		
		System.out.println(list);
		System.out.println(list.get(1));
		list.add(2,"java");
		System.out.println("after insert"+list);
		list.set(3, "c#");
		System.out.println("after changes"+list);
		
		list.remove(0);
		System.out.println("after removing"+list);
		
		ArrayList list2=new ArrayList();
		list2.add('A');
		list2.add(null);
		
		list.removeAll(list2);
		System.out.println("after remov"+list);
		System.out.println("list is emty"+list.isEmpty());
		
//		list.clear();
//		System.out.println("list is emty"+list);
//		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		for(Object f:list)
		{
			System.out.println(f);
		}
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
