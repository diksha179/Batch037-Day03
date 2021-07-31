package com.blz.practiceproblems;

public class EmpWagesUC5 {

	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int WagesPerHr = 1;
	public static final int WorkingDays = 1;

	public static void main(String[] args) {

		int EmpHrs = 0, EmpWages = 0, TotalEmplWages = 0;
		for (int day = 0; day < WorkingDays; day++) {
			int Empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (Empcheck) {
			case FullTime:
				EmpHrs = 8;
				break;
			case PartTime:
				EmpHrs = 4;
				break;
			default:
				EmpHrs = 0;
			}
			EmpWages = EmpHrs * WagesPerHr;
			TotalEmplWages += EmpWages;
			System.out.println("Emp Wage: " + EmpWages);
		}
		System.out.println("Total Emp Wage: " + TotalEmplWages);
	}
}
