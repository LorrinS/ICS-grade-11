/*
Shen Lorrin
Feb 7-9 2020
Assignment 4: Excercise 7, 8, 10 pg 44-45 in the booklet
ICS3U7-01 Ms. Strelkovska
*/
import java.util.Scanner;

class ShenL_assignment4{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	//Q7 - 3 digit number

	System.out.print("Enter a three-digit number: ");
	int triDigit = sc.nextInt();
	System.out.println("The hundreds-place digit is: " + triDigit/100);
	System.out.println("The tens-place digit is: " + (triDigit%100)/10);
	System.out.println("The ones-place digit is: " + triDigit%10);
	
	System.out.println("\n");
	//Question 8 
	
	System.out.print("Enter an integer: ");
	int int1 = sc.nextInt();
	System.out.print("Enter an integer: ");
	int int2 = sc.nextInt();
	
	System.out.println(int1 + " / " + int2 + " = " + int1/int2);
	System.out.println(int1 + " % " + int2 + " = " + int1%int2 + "\n");
	System.out.println(int2 + " / " + int1 + " = " + int2/int1);
	System.out.println(int2 + " % " + int1 + " = " + int2%int1);
	
	System.out.println("");
	//Question 10
	
	System.out.println("Enter your birthdate:");
	System.out.print("Year: ");
	int year1 = sc.nextInt();
	System.out.print("Month: ");
	int month1 = sc.nextInt();
	System.out.print("Day: ");
	int day1 = sc.nextInt();
	
	System.out.println("Enter today's date:");
	System.out.print("Year: ");
	int year2 = sc.nextInt();
	System.out.print("Month: ");
	int month2 = sc.nextInt();
	System.out.print("Day: ");
	int day2 = sc.nextInt();	
	
	int daysAlive = ((year2-year1)-1)*365 + 365-((month1*30)+day1) + month2*30 + day2;
	int hoursSlept = daysAlive*8;
	
	System.out.println("You have been alive for: " + daysAlive + " days.");
	System.out.println("You have slept " + hoursSlept + " hours.");
	
	}
}