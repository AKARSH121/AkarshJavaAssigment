package com.AkarshJavaAssigments;

import java.util.Arrays;
import java.util.Scanner;

public class UpperCaseCode6 {

	public static void main(String[] args) {
		System.out.println("Enter the cases values:");
		String alpha = new Scanner(System.in).nextLine();
		String[]  split = alpha.split("");
		UpperCaseCode6 cod =  new UpperCaseCode6();
		String [] result = cod.sort(split);
		System.out.println("Sorted list are ");
		for(String str:result)  {
			System.out.print(str);;
			
			
		}
	}
	String[] sort(String [] alpha) {
		Arrays.sort(alpha);
int mid = alpha.length/2;
for(int i = 0;i<mid;i++) {
	alpha[i]=alpha[i].toUpperCase();
}
if(alpha.length%2 !=0)
	alpha[mid]=alpha[mid+1].toUpperCase();
return alpha;
	}

}
