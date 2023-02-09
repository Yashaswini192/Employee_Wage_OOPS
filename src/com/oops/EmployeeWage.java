package com.oops;

public class EmployeeWage {
	
	public static void main(String[] args) {
		int isPresent = 1;
		int isAbsent = 0;
   	 
		int checkAttendance = (int) ((Math.random() * 10) % 3);
		if(checkAttendance == isPresent) {
			System.out.println("employee is present");
			}
		else {
			System.out.println("employee is absent");
			}
	}
}
