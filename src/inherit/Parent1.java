package inherit;

import org.testng.annotations.Test;

public class Parent1 extends Parent 
{
	@Test
	public void testRun()
	{
		int a=3;
		Parent2 p2=new Parent2(a); //Parameterized constructor
		Parent3 p3=new Parent3(a);
		doThis(); // Main parent class
		System.out.println(p2.increment());
		System.out.println(p2.decrement());
		System.out.println(p2.multiplyTwo());
		System.out.println(p2.multiplyThree());
		
	}
}
