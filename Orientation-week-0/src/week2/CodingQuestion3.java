package week2;

import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class CodingQuestion3 {


    static void checkCode(int num1, int num2, int num3) {
        // write your code here
        
    if (num1 > num2 && num1 > num3 && num2 < num3) {
    	System.out.println("True");
    } else {  
    	System.out.println("False");
    	}
    }
    // DO NOT CHANGE YOUR CODE BELOW THIS LINE
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int a,b,c;
		a = in.nextInt(); 
		b = in.nextInt(); 
		c = in.nextInt(); 
		checkCode(a, b, c);
		
	}
}