package constructor;

public class democonst {
	
	
	public democonst()
	{
		System.out.println("default const");
	}
	
	public democonst(String q)
	{
		this();
		System.out.println(q);
	}
	
	public democonst(int o)
	{
		this("pune");
		System.out.println(o);
	}
	
	public democonst(String q,int o)
	{
		this(500);
		
			System.out.println(q);
			System.out.println(o);
		}
	
	public democonst(char m)
	{
		this("pune");
		
		System.out.println(m);
	}
	
	public democonst(boolean k)
	{
		this('l');
		System.out.println(k);
		
	}
		
		public static void main(String[] args) {

		new  democonst(true);
		

	}
}
