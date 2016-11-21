import java.util.Scanner;

public class Bool {

	public static void main(String[] args)

	{

		String firstString;

		String secondString;

		boolean same;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first String");

		firstString =in.next();

		System.out.print("Enter second String");

		secondString =in.next();

		 if(firstString.equals(secondString))
		 {
			 same=true;
			 System.out.println("Strings are same");
			 System.out.println("Value of same:"+same);
			
		 }
		 else
		 {
			 same=false;
			 System.out.println("Strings are different:"+same);
			 System.out.println("Value of same:"+same);
		 }
		 

	

	}

}