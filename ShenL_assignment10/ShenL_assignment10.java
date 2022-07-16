/* Lorrin Shen
Methods 1 assingment
March 10 2020
ICS3U7-01 Ms.Strelkovska
*/

import java.util.Scanner;

public class ShenL_assignment10{
	public static void main(String args[]){
	//sumOfCubes
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num1 = sc.nextInt(); 
		System.out.println("The sum of the cubes of the digits is: "+sumOfCubes(num1));
		
	//printHailstones
		System.out.print("Enter an initial number for a hailstone series: ");
		int num2 = sc.nextInt();
		printHailstones(num2);
		
	//hailstoneLength
		System.out.print("Number of interations in hailstone series with initial number of: ");
		int num3 = sc.nextInt();
		System.out.println("Iterations: "+hailstoneLength(num3));
	}
	
	public static int sumOfCubes(int number){
		String num = ""+number;
		int total = 0;
		int digit = 0;
		
		for (int i = 0; i<num.length(); i++){
			digit = Integer.parseInt(String.valueOf(num.charAt(i)));
			total+=Math.pow(digit,3);
		}
		return total;
	}
	
	public static void printHailstones(int num){
		String hailstone = "";
		
		while(true){
			if(hailstone.contains("4, 2, 1,")){
				hailstone += "...";
				break;
			}
			hailstone += num+", ";
			if(num%2==0)
				num /= 2;
			else
				num = num*3 + 1;
		}
		System.out.println(hailstone);
	}

	public static int hailstoneLength(int hailstone){
		int counter = 0;
		
		while(hailstone!=1){
			counter+=1;
			if(hailstone%2==0)
				hailstone /= 2;
			else
				hailstone = hailstone*3 + 1;
		}
		counter+=1; 
		return counter;
		}
		
	}