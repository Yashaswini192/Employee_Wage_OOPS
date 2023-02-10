package com.oops;

public class EmployeeWage {

	static int isPresent = 1 ;
	static int isAbsent = 0 ;
	static int part_time = 2;
	static int wagePerHour = 20;
	static int fulldayHours = 16;

	public void Attendance() {

		int checkAttendance = (int) ((Math.random() * 10) % 4);
		switch (checkAttendance) {
		case 1:
			System.out.println("employee is present");
			fulldayHours = 16;
			break;
		case 2:
			System.out.println("employee is absent");
			fulldayHours = 0;
			break;
		case 3:
			System.out.println("employee is working part time");
			fulldayHours = 8;
			break;
		default:
			System.out.println(" employee need to be hired");
			break;
		}
	}				
}

class DailyWages extends EmployeeWage{


	public void dailywage() {

		int dailyWages = fulldayHours * wagePerHour ;
		System.out.println("dailywages:"+dailyWages);

	}
}


