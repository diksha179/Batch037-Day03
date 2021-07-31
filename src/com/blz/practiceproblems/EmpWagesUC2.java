package com.blz.practiceproblems;

public class EmpWagesUC2 {
	public static void main(String[] args) {
		int WorkingFullTimePerDay = 1;
		int WagesPerHr = 20;
		int EmpHrs = 0;
		double Empcheck = Math.floor(Math.random() * 10) % 2;
		if 
		(Empcheck == WorkingFullTimePerDay)
		   EmpHrs = 8;
		else
			EmpHrs = 0;
		double total;
		total = EmpHrs * WagesPerHr;
			System.out.println("Your per day wages:"+ total);

	}

}
