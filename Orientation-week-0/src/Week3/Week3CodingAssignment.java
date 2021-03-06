package Week3;

import java.util.Arrays;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
//		subtractFirstFromLast(ages);
//		
//		int newAge = 10;
//		int[] agesPlusOne = addNewAgeToArray(ages, newAge);
//		subtractFirstFromLast(agesPlusOne);
//		
//		
//		System.out.println("The average age for the first array is: "+(calculateAverageAge(ages)));
//		
//		System.out.println("The average age for the second array is: "+(calculateAverageAge(agesPlusOne)));
	
//		String[] names = new String[]{"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
// 		System.out.println("The average number of letters per name is: " + avgNameLength(names));
//		
//		System.out.println("All names concatenated are: " + concatNamesTogether(names));
//		
//		System.out.println("The last element of the names array: " + names[names.length-1]);
//		
//		System.out.println("The first element of the names array: " + names[0]);
	
//		System.out.println(Arrays.toString(populateNameLengthsArray(names)));
		
//		int[] nameLengths = populateNameLengthsArray(names);
//		sumNameLengthsArray(nameLengths);
		
//		int numTimes = 3;
//		String userWord = "Hello";
//		System.out.println(repeatWord(userWord,numTimes));
		
//		String firstName = "John";
//		String lastName = "Doe";
//		System.out.println(yourFullName(firstName,lastName));
//
//		int [] numbers = new int[] {8, 9, 0, 45, 1, 15};
//		
//		boolean isSumGreaterthan100 = sumChecker(numbers);
//		
//		if (isSumGreaterthan100) {
//			System.out.println("The sum of all numbers in the array is greater than 100");
//		} 
//		else {
//			System.out.println("The sum of all numbers in the array is NOT greater than 100");
//		}
		
//		double [] priceArray = new double [] {8.99, 10.75, 5.5, 0.99, 1.22};
//		System.out.println("The average of all elements in array of doubles is : " + calculateAverage(priceArray));
		
//		double[] arrayDouble1 = new double[] {18.99, 12.55, 0.5, 9.99, 25.10};
//		double[] arrayDouble2 = new double[] {50.00, 1.50, 25.65, 19.99, 0.15};
//		
//		boolean isArrayHaveGreaterAverage = compareAverage(arrayDouble1,arrayDouble2); 
//		
//		if (isArrayHaveGreaterAverage) {
//			System.out.println("The first double array has greater average!");
//		} else {
//			System.out.println("The second double array has greater average!");
//		}
//		
//		boolean isHotOutside = true;
//		double moneyInPocket = 12.50;
//		
//		System.out.println("Can I buy a drink? " + willBuyDrink(isHotOutside, moneyInPocket));
		
		int lengthOfSquare = 12;
		System.out.println("The perimeter of this square is: " + calcPerimeterOfSquare(lengthOfSquare));
		

		
	}
	
	private static int calcPerimeterOfSquare(int lengthOfSquare) {

		return (lengthOfSquare*4);

	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside && (moneyInPocket > 10.50)){
			return true;
		} 
		else {
			return false;
		}
	}

	public static boolean compareAverage(double[] arrayDouble1, double[] arrayDouble2) {
		
		double totalArray1 = 0;
		for (double total1 : arrayDouble1) {
			totalArray1 += total1;
		}
		
		double totalArray2 = 0;
		for (double total2 : arrayDouble2) {
			totalArray2 += total2;
		}

		double averageArray1 = totalArray1/arrayDouble1.length;
		double averageArray2 = totalArray2/arrayDouble2.length;
		
		if (averageArray1 > averageArray2){
			return true;
		} else {
			return false;
		}
		
	}
	
	public static double calculateAverage(double[] priceArray) {
		
		double totalPrice = 0;
		for (double price : priceArray) {
			totalPrice += price;
		}
		return totalPrice / priceArray.length;
	}

	public static boolean sumChecker(int[] numbers) {
		
		int sum = 0;
		for (int number : numbers) {
			sum += number; 
		}
		
		if (sum > 100) {
			return true;
		} else { 
			return false;
		}
	}

	public static String yourFullName (String firstName, String lastName) {
		
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public static String repeatWord(String userWord, int numTimes) {
	
		String result = "";
		for (int i=0; i<numTimes; i++) {
			result += userWord;		
		}
		return (result);
	}

	public static void sumNameLengthsArray (int[] nameLengths) {
		int sum = 0;
		for (int nameLength : nameLengths) {
			sum += nameLength;
		}
		System.out.println("The sum of all elements in the array is: " + sum);
		
	}
	
 	public static int[] populateNameLengthsArray (String[] names) {

 		int[] nameLengths = new int[names.length]; 
 		for (int i = 0; i < names.length; i++) {
 			nameLengths[i] = names[i].length();	
 			
 		}
 		return(nameLengths);
 		
 	}
	
 	public static String concatNamesTogether(String[] names) {

 		String result = "";
 		for (String name: names) {
 			result += name + " ";		
 		}
 		return (result);
 	}
	
	public static int avgNameLength(String[] names) {

		int nameLength = 0;
		for (String name: names) {
			nameLength += name.length();		
		}
		return (nameLength / names.length);

	}

	public static void subtractFirstFromLast(int[] ages) {

		System.out.println(ages[ages.length-1] - ages[0]);
		
	}
	
	public static int[] addNewAgeToArray (int[] ages, int newAge) {
		
		int [] arrayWithNewAge = new int[ages.length+1];
		
		arrayWithNewAge[0] = newAge;
		
		for (int i = 1; i < arrayWithNewAge.length; i++) {
			arrayWithNewAge[i] = ages[i-1];
		}
	
		return arrayWithNewAge;
		
	}
	
	public static int calculateAverageAge (int[] ages) {
		
		int sum = 0;
		for (int age: ages) {
			sum += age;
		}
		return sum / ages.length;
		
	}
}
