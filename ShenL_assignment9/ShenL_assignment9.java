/*
Shen Lorrin
Mar 6 2020
Assignment 9: Loop excercises Set 4
ICS3U7-01 Ms. Strelkovska
*/
import java.util.Scanner;

class ShenL_assignment9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Q1
		for(int i = 0; i<3; i++){
			for(int j = 0; j<5; j++){
			System.out.print("@");
			}
			System.out.println("");
		}
		
		//Q2
		for(int i = 0; i<4; i++){
			for(int j = 1; j<7; j++){
			System.out.print(j);
			}
			System.out.println("");
		}
		//Q3
		for(int i = 0; i<3; i++){
			for(int j = 1; j<10; j++){
			System.out.print(10-j);
			}
			System.out.println("");
		}
		//Q4
		for(int i = 0; i<6; i++){
			for(int j = 0; j<i; j++){
			System.out.print(i);
			}
			System.out.println("");
		}
		//Q5
		System.out.print("number: ");
		int q5 = sc.nextInt();
		for(int i = 0; i<q5; i++){
			for(int j = 1; j<q5-i+1; j++){
			System.out.print(j + " ");
			}
			System.out.println("");
		}
		//Q6
		System.out.print("number: ");
		int q6 = sc.nextInt();
		for(int i = 1; i<q6+1; i++){
			for(int j = 1; j<q6+1; j++){
				if(i>j)
					System.out.print("  ");
				else
					System.out.print(j+ " ");
			}
			System.out.println("");
		}
		//Q7
		System.out.print("height: ");
		int q7 = sc.nextInt();
		for(int i = 1; i<q7; i++){
			for(int j = 1; j<q7+1; j++){ // top half
				if(i<j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 0; i<q7; i++){
			for(int j = 1; j<q7-i+1; j++){ //bottom half
			System.out.print("*");
			}
			System.out.println("");		
	}
	//Q8
		System.out.print("number: ");
		int q8 = sc.nextInt();
		for(int i = 1; i<=q8; i++){
			for(int j = q8-i; j>=1; j--){ // spaces that go before the stars to center it
				System.out.print(" ");
			}
			for(int k = 1; k<=i*2-1; k++){ //printing the stars
				System.out.print("*");
			}
			System.out.println("");
			}
	}	
}