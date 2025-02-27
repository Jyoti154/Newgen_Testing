package OOPS;

public class demo extends Inheritance{
	public void thar()
	{
		System.out.println("this is thar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo d= new demo();
		d.thar();
		d.techmahindra();
		d.car();
		
		indemo in=new indemo();
		in.bullet();
		in.car();
		in.techmahindra();
		in.car();
		
		test t=new test();
		t.cycle();
		t.techmahindra();
		t.car();
	}

}
