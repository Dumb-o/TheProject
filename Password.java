package tutorial8;
import java.util.Scanner;

public class Password extends Main{
	Scanner input = new Scanner(System.in);
	public String initialPw,checkPw;
	boolean isError = false;
	int numberCheck = 0;
	
	public Password() {}
	
	public void password() {
		System.out.println("Please enter your password: ");
		initialPw = input.nextLine();
		System.out.println("Please confirm your password: ");
		checkPw = input.nextLine();
		
		if (initialPw.equals(checkPw)){  
			isError = false;
		}
		else {
			System.out.println("Your passwords do not match"
					+"\nPlease start again ");
			isError = true;
		}
		
		if(checkPw.indexOf("@") == -1 && checkPw.indexOf("$") == -1) {
			System.out.println("The password must have either '@' or '$' as well");
			isError = true;
		}
	}
	
	public void PwNumCheck() {
		char[] charArray = checkPw.toCharArray();
		for(char c: charArray) {
			String character = Character.toString(c);
			for(int i=0;i<=9;i++) {
				String number = String.valueOf(i);
				if(character.equals(number)) {
					numberCheck += 1;
				}
			}
		}
		
		if(numberCheck == 0) {
			System.out.println("You need numbers in your password too. ");
			isError = true;
		}
		String character = Character.toString(charArray[0]);
		if(character.equals("0") || character.equals("1") || character.equals("3") || character.equals("4") || character.equals("5") || character.equals("6") || character.equals("7") || character.equals("8") || character.equals("9")) {
			System.out.println("The first word of your password must be an alphabet");
			isError = true;
		}
		
	}
	public boolean check() {
		return isError;
	}
	
	public String getPassword() {
		return this.checkPw;
	}
}
