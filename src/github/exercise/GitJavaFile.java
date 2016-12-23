package github.exercise;

import java.util.ArrayList;

public class GitJavaFile {

	public static void main(String[] args) {
		String name = " This is Md Chowdhury.";
		int num = 32;
		String age = name + "i am " + num + " years old";
		System.out.println(age);

		String country = " My country Name Is Bangladesh";
		System.out.println(country);
		System.out.println("Ans 1." + getMyName(name));
		System.out.println("Ans 2." + getEvenNumberList(num));
		System.out.println("Ans 3. " + getOddNumList(num));
		System.out.println("Ans 4. " + getKilo(num));
		System.out.println("Ans 5. " + getUpperCase(name));
		System.out.println("Ans 6. " + getLowerCase(name));
		System.out.println("Ans 7. " + getSum(num));

	}
	/** 7. Write a method that take one number input and return the sum of 1 to given number.
		 * input/parameter = int number 
		 * outpuy/return type = int 
		 * serving bucket = variable 
		 */
	public static int getSum(int number){
		int sum = 0;
		for (int i = 0; i <=number; i++ ){
			sum = sum+i;
		}
		return sum;	
	}
	/**
	 * Qua 6. write a method that take a String input and return same string on Lower case
	 *  input / parameter = String text 
	 *  output / Return type = String
	 * serving bucket / container = variable
	 */
	public static String getLowerCase(String text){
		String lowerCase = "";
		lowerCase = text.toLowerCase();
		return lowerCase;
		
	}
	/**
	 * Qua 5. write a method that take a String input and return same string on
	 * upper case input / parameter = String text output / Return type = String
	 * serving bucket / container = variable
	 */
	public static String getUpperCase(String text){
		String upperCase = " ";
		upperCase = text.toUpperCase();
		
		return upperCase;
	}

	/**
	 * qua 4.Write a method that Take input as a mile and return as a kilometer
	 * input parameter = double number output / return type = int serving bucket
	 * = variable ;
	 */

	public static double getKilo(int number) {
		double kilo = 0;
		kilo = number * 1.6;

		return kilo;

	}

	/**
	 * Que 3. Write a Method that take a Number input and return the list of all
	 * Odd number 0 to given number input / parameter = int Number output/return
	 * type = ArrayList<Integer> Serving bucket Container = list
	 */
	public static ArrayList<Integer> getOddNumList(int number) {
		ArrayList<Integer> oddNumList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				oddNumList.add(i);
			}
		}
		return oddNumList;
	}
	/**
	 * Que 2. Write a Method that take a Number input and return the list of all
	 * even number 0 to given number input / parameter = int Number output
	 * return type = ArrayList<Integer> Serving bucket Container = list
	 */
	public static ArrayList<Integer> getEvenNumberList(int number) {
		ArrayList<Integer> evenNumList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				evenNumList.add(i);
			}
		}
		return evenNumList;
	}
	/**
	 * Qua 1.Write a method that take your name and return your name
	 */
	public static String getMyName(String name) {
		String myName = "";
		myName = myName + name;

		return myName;
	}
}
