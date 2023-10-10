package exceptionhandling;

import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
	
	
}

public class Invalidage {
	public static void main(String[] args) {
		int a=18;
		Scanner obj=new Scanner(System.in);
		int b= obj.nextInt();
				try {
					if(b<a) {
						throw new InvalidAgeException("Age must be 18 or older.");
					}
				
				System.out.println("adult");
				}
	
				catch (InvalidAgeException e) {
					System.out.println("error:"+" "+e.getMessage());
					
				}
	}

}
