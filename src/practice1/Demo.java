package practice1;

public class Demo implements B
{

	@Override
	public void m1() {
		System.out.println("HI");
		
	}
	
	
}

interface B{
	void m1();
	public default void m2()
	{
		System.out.println("hiii");
	}
}
