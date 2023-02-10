package com.oops;

public class EmployeeWage {

	static int isPresent = 1 ;
	static int isAbsent = 0 ;
	static int wagePerHour = 20;
	static int fulldayHours = 8;
	
	public void Attendance() {

		int checkAttendance = (int) ((Math.random() * 10) % 2);
		if(checkAttendance == isPresent) {
			System.out.println("employee is present");
			fulldayHours = 8;
		}
		else if (checkAttendance == isAbsent){
			System.out.println("employee is absent");
			fulldayHours = 0;
		}
		else {
			System.out.println("employee is not working");
		}
	}				
}

class DailyWages extends EmployeeWage{
	
	
	public void dailywage() {
		
		int dailyWages = fulldayHours * wagePerHour ;
		System.out.println("dailywages:"+dailyWages);

	}
}


