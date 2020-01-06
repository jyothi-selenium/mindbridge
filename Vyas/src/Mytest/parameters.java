package Mytest;

public class parameters
{
public void sum()	
{
	
}
	public void sum(int a , int b)
	{
		int c =a+b;
		System.out.println("Result is" +c);
	}

	public static void main(String[] args) 
	{
		parameters obj1 = new parameters();
		obj1.sum(5,10);

	}

}
