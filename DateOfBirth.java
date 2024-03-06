package tutorial8;
import java.util.Scanner;

public class DateOfBirth extends Main{
	private String DOB_temp;
	Scanner input = new Scanner(System.in);
	boolean isError;
	
	public DateOfBirth() {}
	
	public void dateofbirth() {
		System.out.println("Please enter your Date of Birth #DD/MM/YYYY");
		DOB_temp = input.nextLine();
		String[] parts = DOB_temp.split("/");	
		int birthyear = Integer.parseInt(parts[2]);
		if(2023 - birthyear <= 21) {
			System.out.println("You arent old enough");
			isError = true;
			
		}
		if(isError == false) {
			System.out.println("Successfully Signed In. ");
		}
	}
	
	public boolean check() {
		return isError;
	}
	
	public String getDOB() {
		return this.DOB_temp;
	}
}
