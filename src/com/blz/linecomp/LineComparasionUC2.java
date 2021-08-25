package com.blz.linecomp;

import java.util.Random;

public class LineComparasionUC2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int x1 = rand.nextInt(20);
		int y1 = rand.nextInt(20);
		int x2 = rand.nextInt(20);
		int y2 = rand.nextInt(20);
		int x = ((x1-y1));
		int y = ((x2-y2));
		System.out.println(Math.sqrt(x+y));
		if(x == y) {
		  System.out.println("both are equal in lengths");
		}
		  else {
				System.out.println("both are not equal in length");
		}
	
		
		
	}

}
