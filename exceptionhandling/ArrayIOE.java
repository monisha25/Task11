package exceptionhandling;

public class ArrayIOE {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		 // ArrayIndexOutOfBoundsException
		try {
			int b=a[6];
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Error"+e.getMessage());
		}
		//StringIndexOutOfBoundsException
		try {
			String r="tamil";
			char q=r.charAt(10);
		
		}catch(Exception f) {
			System.out.println("Erro"+ f.getMessage());
		}
	}
	

}
