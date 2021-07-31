package com.blz.practiceproblems;

public class EmpWagesUC3 {
	
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int WagesPerHr = 20;
	
	public static void main(String[] args) {
		int EmpHrs = 0;
		int EmpWages =0;
		double Emp = Math.floor(Math.random() * 10) % 3;
		switch ((int)Emp) {
		case 
		     FullTime:EmpHrs = 8;
		case 
		     PartTime:EmpHrs = 4;
		break;
		default:
			 EmpHrs = 0;
		}
		EmpWages = EmpHrs * WagesPerHr;
		System.out.println("EmpWages:"+EmpWages);
	}

}

