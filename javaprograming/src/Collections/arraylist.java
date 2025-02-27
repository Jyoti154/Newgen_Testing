package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {

HashSet myset=new HashSet();
myset.add(10);
myset.add(10.5);
myset.add("welcome");
myset.add('A');
myset.add(null);
myset.add(10);

System.out.println(myset);

myset.remove(10);
System.out.println("after remove:"+myset);
ArrayList al= new ArrayList(myset);
System.out.println(al);
System.out.println(al.get(2));

for(Object x: myset)
{
	System.out.println(x);
}


Iterator it=myset.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
