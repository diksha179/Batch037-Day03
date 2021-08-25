package com.blz.linecomp;

import java.util.Scanner;

public class LineComparasionUC1 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter value of x1");
		Integer x1 = scanner.nextInt();
		System.out.println("Enter value of y1");
		Integer y1= scanner.nextInt();
		System.out.println("Enter value of x2");
		Integer x2 = scanner.nextInt();
		System.out.println("Enter value of y2 ");
		Integer y2 = scanner.nextInt();
		Integer x= (x1-y1);
		Integer y= (x2-y2);  
		int res = x.compareTo(y);
	 
	      if(res> 0) {
	         System.out.println("x is greater than y");
	      } else if(res < 0) {
	         System.out.println("x is less than y");
	      } else {
	         System.out.println("x is equal to y");
	         scanner.close();
	      }
	   
	   }
	} 


