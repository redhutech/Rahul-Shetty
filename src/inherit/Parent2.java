package inherit;

public class Parent2 extends Parent3 
{
	int a;
	//default constructor
	
	public Parent2(int a) 
	{
		super(a); //parent3 class constructor is invoked
		this.a=a;
	}
	public int increment()
	{
		a=a+1;
		return a;
	}
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
