package reverse;

public class Reverse_String {

	public static void main(String[] args) 
	{
	String name = "Avnish is good boy";//select name that you want to print
		int length = name.length();//find length
		String rev = "";   //create ref variable rev and make it blank
		for(int i=length-1;i>=0;i--) 
		{
			 rev = rev+name.charAt(i);// we can also print by  System.out.print(rev+name.charAt(i));
			 
		}
		System.out.println(rev);
		
//		StringBuffer sb= new StringBuffer(name);
//	System.out.println(sb.reverse());
	}

}
