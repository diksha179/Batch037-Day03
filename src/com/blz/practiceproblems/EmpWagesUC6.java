package com.blz.practiceproblems;
import java.util.Random;

public class EmpWagesUC6 {

	public static void main(String[] args) {
		}
		private void CalculateWage() {
			int WagesPerHr = 20;
			int FullTimer = 8;
			int PartTimeHr = 4;
			int TotalWorkingHr = 100;
			int WorkingDays = 20;
			int EmpHr = 20;
			int TotalEmpHr = 0;
			int days = 0;
			int TotalWages = 0;
			System.out.println("Hours of Working");
	        Random rand = new Random();	
	        int upperbound = 2;
	        while
	        	(days<20 && EmpHr<=100) {
	        	int choice = rand.nextInt(upperbound);
	        	switch (choice) {
	        	case 1:
	        		EmpHr = 8;
	        		break;
	        	case 2:
	        		EmpHr = 4;
	        		break;
	        	default:
	        		EmpHr = 0;
	        		 System.out.println("Choose one option");
	        	
	        }
	        	TotalEmpHr = EmpHr +TotalEmpHr;
	        	days++;
	        	System.out.println(TotalEmpHr+" : "+days);
	        	
	        }
	           TotalWages = TotalEmpHr*WagesPerHr;
	           System.out.println(TotalWages+" : "+TotalWages );
			
			
		}

	}


