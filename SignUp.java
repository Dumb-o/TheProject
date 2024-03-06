package tutorial8;
import java.util.Scanner;
import java.util.ArrayList;

public class SignUp extends Main{
	
	ArrayList<String> alphabets = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	private String userName;
	private int userLength;
	public boolean isError;
	
	public SignUp() {}
	
	public void sign() {
		System.out.println("Please Enter your full name: ");
		userName = input.nextLine();
		userLength = userName.length();
		
		if(userLength <= 4) {
			System.out.println("Your name must be larger than 4 digits");
			isError = true;
		}
	}
	
	public boolean check() {
		return isError;
	}
	
	public String getName() {
		return this.userName;
	}
	
}
