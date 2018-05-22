package com.saintmarys.ms.assignment;

import java.util.Scanner;

/**
 * Class comment, from interview question
 * 
 * @author Gowrishankar Sekar (ID)
 *
 */
public class PrintAsterisks {
	
	/**
	 * 
	 * @param args
	 * 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Get the input from the user
		System.out.println("This program prints out lines of stars.");
		Scanner getMin = new Scanner(System.in);
		Scanner getMax = new Scanner(System.in);
		Scanner getInterval = new Scanner(System.in);				
		System.out.print("What is the minimum number of stars? ");
		int min = getMin.nextInt();		
		System.out.print("What is the maximum number of stars? ");
		int max = getMax.nextInt();		
		System.out.print("What is the interval? ");
		int interval = getInterval.nextInt();
	
		if(validateInput(min,max,interval)) {
			//printStars
			printStars(min,max,interval);
		} else {
			// User input validation fails.
			System.out.println("Please check the input values");
		}
	}
	
	/**
	 * Validation of user input.
	 * - Min should be always less than Max input
	 * - Interval entered, when summed up should reach specified Max input.
	 * 
	 * @param min
	 * @param max
	 * @param interval
	 * @return status 
	 * 
	 */
	private static boolean validateInput(int min, int max, int interval) {		
		if(min >= max ) {
			return false;
		}		
		while (min <= max) {
			if(min == max) {				
				return true;				
			}
			min += interval;
		}		
		return false;
	}
	
	/**
	 * Print stars.
	 * 	 * 
	 * @param min
	 * @param max
	 * @param interval
	 * @return status 
	 * 
	 */
	private static void printStars(int min, int max, int interval) {	
		for(int i=min ; i<max; min = min +interval) {
			for(int j=1; j<=min;j++ ) {
				//print star
				System.out.print("*");
			}
			System.out.println(" ("+min+" stars)");				
			if(min==max) {
				break;
			}
		}	
	}
	

}
