package tutorial8;
import java.util.Scanner;

public class MobileNo extends Main{
	private String mobileNumber;
	boolean isError = false;
	Scanner input = new Scanner(System.in);
	public MobileNo() {}
	
	public void mobile() {
		System.out.println("Contact Information: ");
		mobileNumber = input.nextLine();
		if(mobileNumber.length() != 10 || mobileNumber.indexOf("0") != 0 ){
			System.out.println("The mobile number must have 10 digits and begin with 0");
			isError = true;
		}
	}
	
	public boolean check() {
		return isError;
	}
	
	public String getNumber() {
		return this.mobileNumber;
	}
}
