package Week3;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MethodsReview {

	static boolean passwordChecker(String password) {
		// Write your code below this line 
		//int x = password.length();
		if ((password.length()) < 8) {
			return false;
		} else {
			if (password.contains("!")){
				return true;
			} 
			else if (password.contains("$")){
				return true;
			} 
			else if (password.contains("%")){
				return true;
			}
			else if (password.contains("&")){
				return true;
			}			
			else {
				return false;
			}
		}
	}
			
					
					 
				


    
    // Do not change the code below this line
	public static void main(String[] args) {
		String password = "thisshouldwork!";
        boolean meetsRequirement = passwordChecker(password);
        
        System.out.println(meetsRequirement);
		if (meetsRequirement) {
		    System.out.println(password + " meets the requirements.");
		} else {
		    System.out.println(password + " does not meet the requirements.");
		}
	}
}