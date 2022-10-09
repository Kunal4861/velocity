package accessModifier;

public class Defaultuse {
 int a=25;
 public int b=35;
 private int c=45;
	public static void main(String[] args) 
	{	
		Defaultuse du= new Defaultuse(); // created object of a class
		du.test1();//calling public method
		du.test2();//calling default method
		du.test3();// calling private method
		System.out.println(du.a);// calling default variable within package
		System.out.println(du.b);// calling public variable within project
		System.out.print(du.c);// only visible in same class
	}
	
	
	public void test1()// public method accessible within project
	{
		System.out.println("hi I am public test1 method");
	}
	 void test2()// default method accessible within package
	{
		System.out.println("hi I am default test2 method");
	}
	private void test3()// private method accessible within same class
		{
			System.out.println("hi I am private test3 method");
		}
		
	

}
