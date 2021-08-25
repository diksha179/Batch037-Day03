package com.blz.linecomp;

import java.util.Scanner;

public class LineComparasionUC3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of x1");
		Integer x1 = input.nextInt();
		System.out.println("Enter value of x2");
		Integer y1= input.nextInt();
		System.out.println("Enter value of y1");
		Integer x2 = input.nextInt();
		System.out.println("Enter value of y2 ");
		Integer y2 = input.nextInt();
		Integer x = (x2-x1);
		Integer y = (y2-y1);
	     
		int res = x.compareTo(y);
	    
	      if(res > 0) {
	         System.out.println("x is greater than y");
	      } else if(res < 0) {
	         System.out.println("x is less than y");
	      } else {
	         System.out.println("x is equal to y");
	         input.close();
	      }
	   }
	}
