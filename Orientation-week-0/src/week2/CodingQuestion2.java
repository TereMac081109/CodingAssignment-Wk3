package week2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int personOneAge,personTwoAge, personThreeAge;
		personOneAge = in.nextInt();
		personTwoAge = in.nextInt();
		personThreeAge = in.nextInt();
		
		
		//Do not change any existing code above. 

	
	    // Create your if statement here 
		if (personOneAge > personTwoAge && personOneAge > personThreeAge) {
		    System.out.println("Person one is older."); //Keep this statement 
		}
		// Create your else if statement here 
		else if (personTwoAge > personOneAge && personTwoAge > personThreeAge) {
		    System.out.println("Person two is older."); //Keep this statement
		}
	    // Create your else statement here
		else {
		    System.out.println("Person three is older."); //Keep this statement 
		}



	
	}
}
