package com.coforge2;
import java.util.function.Predicate;
import java.util.Scanner;
public class PasswordAuthFI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// authentication
		
		Predicate<String> authenticateUsername=(uname)->uname.equals("Anurag");
		Predicate<String> authenticatePassword=(pwd)->pwd.equals("81000186");
		Predicate<String> authenticateUsername1=(uname)->uname.equals("Khushboo");
		Predicate<String> authenticatePassword1=(pwd)->pwd.equals("81000182");
		
		System.out.print("Enter the Username: ");
		String usname = sc.nextLine();
		System.out.print("Enter the Password: ");
		String psd = sc.nextLine();
		
		String result = authenticateUsername.test(usname) && authenticatePassword.test(psd) ||  authenticateUsername1.test(usname) && authenticatePassword1.test(psd)? "Authentication Successfull" : "Invalid Credentials !";
		System.out.println(result);
		
		//Validation
		
		Predicate<String> validateUsername =(uname)-> uname.length()>3 && !uname.isBlank() && !(uname.charAt(0) == ' ');
		System.out.println(validateUsername.test(usname));
			
		sc.close();
		
	
	}
	
}
