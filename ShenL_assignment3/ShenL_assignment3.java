/*
Shen Lorrin
Feb 6 2020
Assignment 3: Variable/Calculations excercise
ICS3U7 Ms.Strelkovska
*/

class ShenL_assignment3{
	public static void main(String[] args){
	//Question 1 - Seconds to Time
	int seconds = (int)(Math.random()*5901) + 99;
	int hour = seconds/3600;
	int counter = seconds%3600;
	int minute = counter/60;
	counter = counter%60;
	int second = counter;
	System.out.println("Number of seconds is: " + seconds);
	System.out.format("%s %02d %s %02d %s %02d","The time is: ",  hour, ":", minute, ":", second);
	
	System.out.println("\n");
	//Question 2 - tickets
	double money = (int)(Math.random()*1161)+40;
	int maxTickets = (int)(money/64.97);
	double cost = (double)(Math.round(maxTickets*64.97*100))/100;
	int dollars = (int)(money-cost);
	double cents = Math.round((money-cost-dollars)*100); 
	System.out.println("With " + money + " dollars you can buy " + maxTickets + "tickets.");
	System.out.println("The change is " + (int)dollars +" dollars and " + (int)cents + " cents.");
	
	System.out.println("\n");
	//Question 3 - Calculations
	
	//Question 3a
	double Qa=1.0/4+10-3/(5-0.0024);
	System.out.println(Math.round(Qa*100)/100.0);
		
	System.out.println("\n");
	//Question 3b
	System.out.println(Math.round((((Math.pow ((27.3 +0.3), 3)) - ((3+15.3)/(1.22/2)) + 15.34876)/ Math.sqrt(6))*100)/100.0);
	
	//Question 4 - Sequences
	
	System.out.println("\n");
	//Question 4a
	System.out.println((int)(Math.random()*20)+1);
	
	System.out.println("\n");
	//Question 4b
	System.out.println((int)(Math.random()*9)-6);
	
	System.out.println("\n");
	//Question 4c
	System.out.println((int)((Math.random()*6)+1)*10);
	}
}