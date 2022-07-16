/*
Shen Lorrin
Feb 4 2020
Assignment2: Timetable
ICS3U7-01 Ms.Strelkovska
*/
class ShenL_assignment2{
	public static void main(String[] args){
		
		System.out.println("");
		
		// what the table is
		System.out.println("SEMESTER 2 TERM 1 TIMETABLE:");
		System.out.println("Shen, Lorrin \n");	
		
		//timetable, formatting + content
		System.out.format("%-15s %-15s %-15s %-15s %15s %n", "Day 1", "Teacher", "Day 2", "Teacher", "Time" );
		System.out.format("%-15s %-15s %-15s %-15s %15s %n", "ICS3U7-01", "Strelkovska,H.", "MPM2D7-02", "Yeganegi,A.", "08:45-10:05");
		System.out.format("%-15s %-15s %-15s %-15s %15s %n", "MPM2D7-02", "Yeganegi,A.", "ICS3U7-01", "Strelkovska,H.", "10:10-11:25");
		System.out.format("%-15s %-15s %-15s %-15s %15s %n", "Lunch", "", "Lunch", "", "11:25-12:25");
		System.out.format("%-15s %-15s %-15s %-15s %15s %n", "FSF3U7-02", "James,K.", "SNC2D7-02", "Schweitzer,R.", "12:25-13:40");
		System.out.format("%-15s %-15s %-15s %-15s %15s %n", "SNC2D7-02", "Schweitzer,R.", "FSF3U7-02", "James,K.", "13:45-15:00");
	}
}