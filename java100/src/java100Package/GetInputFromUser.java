package java100Package;
import java.util.Scanner;


public class GetInputFromUser {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in); 
		 System.out.println("Enter your name");
		 String s = obj.nextLine();//read user input
		 System.out.println("You entered your name: "+s);
		 System.out.println("Enter your age");
		 int i = obj.nextInt();
		 System.out.println("You entered your age: "+i);
		 System.out.println("Enter your salary");
		 float f = obj.nextFloat();
		 System.out.println("You entered your salary: "+f);
		 obj.close();
		 }
	}


