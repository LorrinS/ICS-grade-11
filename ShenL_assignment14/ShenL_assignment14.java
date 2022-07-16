import java.util.*;
/*
Shen Lorrin
May 5 2020
Assignment 14: CodeHS CombinationLock
ICS3U7-01 Ms.Strelkovska
*/
public class ShenL_assignment14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		CombinationLock comboLock = new CombinationLock("frog");
		String input = "";
		
	while(!input.equals(comboLock.getWord())){	
		System.out.print("Your Guess: ");
		input = sc.nextLine();
		if(input.length()==4)
			System.out.println(comboLock.getClue(input));
		else
			System.out.println("Invalid Input.");
	}
	System.out.println("Over.");
	}
}