/*
Shen Lorrin
Feb 19 2020
Assignment7: Password Authentication
ICS3U7-01 Ms.Strelkovska
*/
import java.util.Scanner;
class ShenL_assignment7 {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	String pw = "1234";
	String user = "";
	int tries = 1;
	
	while (tries<=3){
		System.out.print("Please enter your 4 digit pin number: ");
		user = sc.nextLine();
		if(user.equals(pw)){
			System.out.println("Pin Accepted! Welcome to the system.");
			break;
		}
		else{
			switch(tries){
				case 1:
					System.out.println("Wrong pin entered, you have 2 attempts remaining\n");
					break;
				case 2:
					System.out.println("Wrong pin entered, you have 1 attempt remaining\n");
					break;
				case 3:
					System.out.println("Wrong pin entered, you have been locked out of the system\n");
					break;
		}
		tries++;
	}

	}
	
}
}