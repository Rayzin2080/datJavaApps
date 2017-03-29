package projectAdmin;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your username?");
		String username = scan.next();
		System.out.println("What is your password?");
		String passwd = scan.next();
		System.out.println("Ok...");
		System.out.println("Username: " + username + "  Password: " + passwd);
		int isAdmin = username.indexOf("ADMIN");
		System.out.println(isAdmin); //0 if admin  -1 if not admin
		if(isAdmin == 0) {
			System.out.println("You seem to be an admin");
			String[] adminName = username.split("ADMIN");
			System.out.println("Welcome ADMIN " + adminName[1]);
		}
		scan.close();
	}
	
}