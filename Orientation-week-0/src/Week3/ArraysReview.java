package Week3;

import java.util.Arrays;

public class ArraysReview {
	
	static char[] wordToArray(String userWord) {
	    //Write your code below 
	 char [] charArray = new char[userWord.length()];
	 for (int i=0; i < userWord.length(); i++) {
		 charArray[i] = userWord.charAt(i);
	 }
	 return charArray;
	    
	}
	   
	
//	static void addX(int[] arr, int x) {
//		// Add your code below this line 
//		System.out.println("**Original**");
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("**New Array**");
//		for (int z=0; z<arr.length; z++) {
//			System.out.println(arr[z]+x);
//		}
//	}
	
//	static void changeTwo(int a, int b, int[] arr) {
//        // Add your code below this line 
//
//        arr[0] = a;
//        arr[arr.length-1] = b;
//        
//        for (int i = 0; i < arr.length; i++) {
//        	System.out.println(arr[i]);
//        }
//	}

//	static int[] buildArray(int num) {
//		// Write your code below
//	    int[] numArray = new int[num];
//		for (int i = 0; i < num; i++ ) {
//			numArray[i] = i;			
//		}
//		return numArray;			
//	}

//	static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
//		// Write your code below this line 
//		int[] arrayInt = {num1, num2, num3,num4,num5,num6};
//		return arrayInt[arrayInt.length - 1];
//		
//	}
	
	
	public static void main(String[] args) {
		
		String userWord = "Greetings";
		
		System.out.println("Your array is: ");
		System.out.println(Arrays.toString(wordToArray(userWord)));

		
//		int x=10;
//		int[] arr = { 5, 10, 44, -4, 10 };
//		addX(arr, x);

//		int a,b;
//		a = 1;
//		b = 1;
//			
//		int[] arr = { 3, 7, 0, 4, -6, 10, 55 };
//		changeTwo(a, b, arr);
		
		}
		
		
//		int num = 8;
//		System.out.println("Your array is: ");
//		System.out.println(Arrays.toString(buildArray(num)));
		
//		int num1, num2, num3, num4, num5, num6; 
//		num1 = 23;
//		num2 = 43;
//		num3 = 897;
//		num4 = 342;
//		num5 = -112;
//		num6 = 45;
//		
//		int returnedInt = createInt(num1, num2, num3, num4, num5, num6);
//		System.out.println("The last number of the array is " + returnedInt);
	
//		int[] arr = new int[5];
//		for (int i=1; i<=5;i++) {
//			arr[i-1]=i;
//		}
//		
//		System.out.println(arr[2]);
//	}
	
}
