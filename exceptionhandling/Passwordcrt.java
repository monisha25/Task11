package exceptionhandling;

import java.util.Scanner;
class IncorrectPasswordException extends Exception{
	public IncorrectPasswordException(String r) {
		super(r);
	}
}
public class Passwordcrt {
	public static void main(String[] args) {
		
	
	String a="Password";
	Scanner obj= new Scanner(System.in);
	String b=obj.nextLine();
	try {
		if(!b.equals(a)) {
			throw new IncorrectPasswordException("incorrct password");
		}
		System.out.println("password correct");
		}
	catch(IncorrectPasswordException e) {
		System.out.println("error"+e.getMessage());
		
	}

}
}