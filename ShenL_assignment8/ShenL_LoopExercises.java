/* Lorrin Shen
Loop Exercises Set #2
March 2 2020
ICS3U7-01 Ms.Strelkovska
*/

import java.util.*;

public class ShenL_LoopExercises{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		System.out.println("1)");
		//Q1
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int counter = 2;
		
		while (counter<=num){
			if(num%counter==0){
				System.out.println(counter);
				num /= counter;
			}
			else
				counter+=1;
		}
		
		System.out.println("\n\n 2)");
		//Q2
		System.out.print("Enter a positive integer: ");
		sc.nextLine();
		String num2 = sc.nextLine(); 
		for (int i = 0; i<num2.length(); i++){
			System.out.println(num2.charAt(num2.length()-1-i));
		}
	
		System.out.println("\n\n 3a)");
		//Q3
		//a
		System.out.print("Enter a positive integer: ");
		String num3 = sc.nextLine();
		int total = 0;
		int digit = 0;
		
		for (int i = 0; i<num3.length(); i++){
			digit = Integer.parseInt(String.valueOf(num3.charAt(i)));
			total+=Math.pow(digit,3);
		}
		System.out.println("The sum of the cubes of the digits is: "+total);
		
		System.out.println("\n\n 3b)");
		//b
		String temp ="";
		int digit2 = 0;
		int check = 0;
		String list = "";
		for(int i = 10; i<10000 ; i++){
			temp = String.valueOf(i);
			check = 0;
			for(int j = 0; j<temp.length(); j++){
				digit2 = Integer.parseInt(String.valueOf(temp.charAt(j)));
				check+=Math.pow(digit2, 3);
			}
			if(i == check)
				list += i+", ";
		}
		System.out.println(list);
		
		System.out.println("\n\n 4a)"); 
		//Q4
		//a
		System.out.print("Enter an initial number for a hailstone series: ");
		int num4 = sc.nextInt();
		String hailstone = "";
		
		while(true){
			if(hailstone.contains("4, 2, 1,")){
				hailstone += "...";
				break;
			}
			hailstone += num4+", ";
			if(num4%2==0)
				num4 /= 2;
			else
				num4 = num4*3 + 1;
		}
		System.out.println(hailstone);
		
		System.out.println("\n\n 4b)");	 
		//b
		System.out.print("Enter 2 numbers: ");
		int lowRange = sc.nextInt();
		int highRange = sc.nextInt();
		String hailstone2 = "";
		int iterations = 0;
		int highestIterations = 0;
		String iterationNum =""; 
		int temp2 = 0;
		
		for(int i=lowRange; i<highRange+1; i++){
			iterations =0;
			temp2 = i;
			while (temp2!=1){
				iterations+=1;
				if(temp2%2==0)
					temp2 /= 2;
				else
					temp2 = temp2*3 + 1;
				}
			if (iterations > highestIterations){
				highestIterations = iterations;
			}
		}
		for(int i=lowRange; i<highRange+1; i++){
			iterations=0;
			temp2 = i;
			while (temp2!=1){
				iterations+=1;
				if(temp2%2==0)
					temp2 /= 2;
				else
					temp2 = temp2*3 + 1;
				}
			if (iterations == highestIterations && !(iterationNum.contains(""+iterations))){ //but if itterations = something already in itterationnum do not include
				iterationNum += " " + i;
			}
		}
			
		System.out.println("After inspecting the hailstone numbers from "+lowRange+" to "+highRange+",");
		System.out.println("The maximum iterations to 4, 2, 1 were: "+highestIterations);
		System.out.println("the maximum iterations occured at: " + iterationNum);
		
	}
}
