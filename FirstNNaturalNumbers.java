package com.AkarshJavaAssigments;

public class FirstNNaturalNumbers {

	public static void main(String[] args) {
		
	}
		public static int difference(int n){
			int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;

			  		  int sumN = (n * (n + 1)) / 2;

			  			  int squareSumN = sumN * sumN;
			  
			  
			  return Math.abs(sumSquareN - squareSumN);
			}
	

	}


