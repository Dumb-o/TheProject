package tutorial8;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		boolean error,a = true;
		
		do {
			System.out.print(
					"Please Enter 1 for Sign Up.\n"
					+ "Please Enter 2 for Quit\n" 
					+ "> ");
			
			int userInp;
			userInp = input.nextInt();
		
			SignUp sign = new SignUp();
			MobileNo mob = new MobileNo();
			Password pas = new Password();
			DateOfBirth DOB = new DateOfBirth();
			
			if(userInp == 1) {
				sign.sign();
				error = sign.check();
				
				if (error == false) {
					mob.mobile();
					error = mob.check();
				}
				
				if (error == false) {
					pas.password();
					pas.PwNumCheck();
					error = pas.check();
				}	
				
				if (error == false) {
					DOB.dateofbirth();
					error = DOB.check();									
				}
				
				if (error == false) {
					list.add(sign.getName());
					list.add(mob.getNumber());
					list.add(pas.getPassword());
					list.add(DOB.getDOB());
				}
				
			}
			else if (userInp == 2) {
				System.out.println("Thank you for using this application.");
				a = false;
			}
			else {
				System.out.println("Invalid Input");
			}
		}while (a == true);
		
		System.out.println(list);
		input.close();
	}
}
