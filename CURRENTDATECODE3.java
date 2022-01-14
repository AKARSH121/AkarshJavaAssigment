package com.AkarshJavaAssigments;
import java.text.SimpleDateFormat;
import java.util.*;
public class CURRENTDATECODE3 {

	public static void main(String[] args) {
		Date date = new Date( );
	    SimpleDateFormat formatOfDate =
	        new SimpleDateFormat (" E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	    System.out.println("Current Date: " + formatOfDate.format(date));

	}

}
