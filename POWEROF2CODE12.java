package com.AkarshJavaAssigments;

import java.io.PrintStream;
import java.util.Scanner;

public class POWEROF2CODE12 {

	public static void main(String[] args) {
		PrintStream cout = System.out;
		int n;
		Scanner ip=new Scanner(System.in);
		n=ip.nextInt();
		
	    if(n>0)
	    {
	      while(n%2 == 0)
	        {
	            n/=2;
	        }
	        if(n == 1)
	        {
	            System.out.println("Number is power of 2");
	        }
	    }
	    if(n == 0 || n != 1)
	    { System.out.println("Number is not power of 2"); }
	}

}
