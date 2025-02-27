package String;

public class StringDemo {

	public static void main(String[] args) {

String s="welcome to java";
System.out.println("tring length:"+s.length());


String a="welcome";
String b="to home";
System.out.println(a.concat(b));
System.out.println("welcome".concat("to home"));

String c= "  jyoti   ";
//System.out.println(c);
//System.out.println("after removing space:"+c.trim());
//
System.out.println(c);
System.out.println(c.length());
System.out.println(c.trim());
System.out.println(c.trim().length());

String d="balaji";
System.out.println(d.charAt(2));

System.out.println(s.contains("Wel"));

String x="welcome";
String y="Welcome";
System.out.println(x.equals(y));
System.out.println(x==y);

System.out.println(x.equalsIgnoreCase(y));

String m="welcome to home jyoti";
System.out.println(m.replace('h', 'k'));

System.out.println(m.replace("welcome", "swagat"));

String o="dahrath";
System.out.println(o.substring(0,5));
System.out.println(o.substring(1,6));


System.out.println(o.toUpperCase());
System.out.println(o.toLowerCase());


int f=10;
int g=20;
int temp=f;
f=g;
g=temp;
System.out.println(f);
System.out.println(g);

int l=50;
int n=100;
l=l+n;
n=l-n;
l=l-n;
System.out.println(l);
System.out.println(n);















	}

}
