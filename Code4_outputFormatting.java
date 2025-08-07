package com.hackerrank;
import java.util.Scanner;
public class OutputFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		String s1=sc.next();
		int n=sc.nextInt();

    //format specifier syntax
		System.out.printf("%15s%06d%n", s1,n);//  % for starts format specifiers ,, if '-' for left alignment and default for right alignment,,'15' for spaces,,'s' because string
                                           // '0' for zero padding if need,,  'd' for decimal
                                           // '%n' for new line

    
	}

}
-------------compiler output----------
enter input
java
98
           java000098
================================
