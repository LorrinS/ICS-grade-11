/*
Shen Lorrin
Apr 21 2020
Assignment13: Sorting Arrays
ICS3U7-01 Ms.Strelkovska
*/

import java.util.*;

class ShenL_assignment13{
	public static void main(String[] args) { 
	int arr[] = new int[1000];
	
	long start1 = 0L; 
	long end1 = 0L;
	int time1 =0;
	long start2 = 0L;
	long end2 = 0L;
	int time2 = 0;
	
	int indexMin = 0;
	int temp = 0;
	
	int k = 0;
	
		//fill up array
		for(int i = 0; i<1000; i++){
			arr[i] = (int)(Math.random()*501);
		}
		
		//print first 100 in array
		for(int i = 0; i<100; i++){
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\n\n\n");
		
		start1 = System.currentTimeMillis();
		
		//sort array - Selection sort
		for(int i = 0; i<arr.length-1; i++){
			indexMin = i;
			for(int j = i+1; j< arr.length; j++){
				if(arr[j] < arr[indexMin])
					indexMin = j;
			}
			temp = arr[indexMin]; 
			arr[indexMin] = arr[i]; 
			arr[i] = temp;
		}

		//timer
		end1 = System.currentTimeMillis();
		time1 = ((int)end1-(int)start1);
		
		//print first 100 in sorted array
		for(int i = 0; i<100; i++){
			System.out.print(arr[i]+ " ");
		}		
		
		System.out.println("\n\n\n");
		
		System.out.println("Selection sort time: "+time1+"milliseconds.");
		
		System.out.println("\n****************************** \n");
		
		//****************************
		
		//fill up array
		for(int i = 0; i<1000; i++){
			arr[i] = (int)(Math.random()*501);
		}
		
		//print first 100 in array
		for(int i = 0; i<100; i++){
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\n\n\n");
		
		start2 = System.currentTimeMillis();
		
		//sort array - Insertion sort
		for(int i = 1; i<arr.length; ++i){
			k = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > k){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = k;
		}
		
		//timer
		end2 = System.currentTimeMillis();
		time2 = ((int)end2-(int)start2);
		
		//print first 100 in sorted array
		for(int i = 0; i<100; i++){
			System.out.print(arr[i]+ " ");
		}		
		
		System.out.println("\n\n\n");
		
		System.out.println("Insertion sort time: "+time2+"milliseconds.");
	}
}