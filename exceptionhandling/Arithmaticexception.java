package exceptionhandling;

import java.util.Scanner;

public class Arithmaticexception {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a= obj.nextInt();
		int b=obj.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
		
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: Division by zero is not allowed.");
			
		}
	}

}
