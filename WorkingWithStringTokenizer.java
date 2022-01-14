package com.AkarshJavaAssigments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WorkingWithStringTokenizer {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in); 
		System.out.println("Enter the number");
		String number = Scan.nextLine();
		StringTokenizer token = new StringTokenizer(number);
		int digit = 0;
		int  sum = 0;
		System.out.println("\n Enter the integers: ");
		while(token.hasMoreTokens())
		{
		            String s=token.nextToken();
		            digit=Integer.parseInt(s);
		            System.out.print(digit+" ");
		            sum=sum+digit;
		}
		System.out.println();
		System.out.println("Sum is : "+sum);

	}

}
