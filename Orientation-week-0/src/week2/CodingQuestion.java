package week2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

		static void doIHaveSchoolToday(String day, String month) {
		
		//Write your code below
        if (day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")){
			System.out.println("I do not have school today!");
		}
		else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
				System.out.println("I do not have school today!");
		} else {
			System.out.println("I do have school today");
		} 
		
		
		
		
		
	}

    // DO NOT CHANGE THE CODE BELOW THIS LINE

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String dayOfWeek, monthOfYear;
		dayOfWeek = in.nextLine();
		monthOfYear = in.nextLine();
		
		doIHaveSchoolToday(dayOfWeek, monthOfYear);
	}
}
