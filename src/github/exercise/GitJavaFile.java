package github.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class GitJavaFile {

	public static void main(String[] args) {
		String name = "This is Md Chowdhury.";
		int num = 32;
		String age = name + "i am " + num + " years old";
		System.out.println(age);

		String country = " My country Name Is Bangladesh";
		System.out.println(country);
		System.out.println("Ans 1." + getMyName(name) );
		System.out.println("Ans 2." + getEvenNumberList(num) );
		System.out.println("Ans 3. " + getOddNumList(num) );
		System.out.println("Ans 4. " + getKilo(num) );
		System.out.println("Ans 5. " + getUpperCase(name) );
		System.out.println("Ans 6. " + getLowerCase(name) );
		System.out.println("Ans 7. " + getSum(num) );
		System.out.println("Ans 8. " + getAllIndexList(name) );
		System.out.println("Ans 9. " + getallChar(name));
		System.out.println("Ans 10. " + getSumAcceptEight(10) );
		System.out.println("Ans 11.  " + getSquare(4) );
		System.out.println("Ans 12. " + Arrays.toString( getNumArray(11) ) );
		System.out.println("Ans 13A. " + getEvebNumCount(num) );
		System.out.println("Ans 13. " + Arrays.toString( getEvenArray(num) ) );
		System.out.println("Ans 14A. " + getOddNumCount( num ) );
		System.out.println("Ans 14. " + Arrays.toString( getOddNumArray(num) ) );

	}
	/**
	 * Qua 14. write a method that takes one number input and return an Array
	 * that contains Odd number 0 to given number 
	 * input / parameter = int number
	 * output / return type = Array ; 
	 * serving bucket = Array
	 */
	public static int[] getOddNumArray(int number) {
		int index = 0;
		int[] oddArray = new int[getOddNumCount(number)];
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				oddArray[index] = i;
				index++;
			}
		}
		return oddArray;
	}
	
	/**
	 *  Qua 14 A. Write A method that takes one number input and return the count of all
	 *  Odd number within 0 to that given number
	 *  input / parameter = int number
	 *  output and return type = int 
	 *  serving bucket = variable
	 */
	
	public static int getOddNumCount(int number) {

		int count = 0;
		for (int i = 0; i < number; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Qua 13. write a method that takes one number input and return an Array
	 * that contains Even number 0 to given number.
	 * input / parameter = int number
	 * output / return type = Array ; 
	 * serving bucket = Array
	 */
	public static int[] getEvenArray(int number) {
		int index = 0;
		int[] evenArray = new int[getEvebNumCount(number)];
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				evenArray[index] = i;
				index++;
			}
		}
		return evenArray;
	}
	/**
	 * Qua 13A. Write A method that takes one number input and return the count of all
	 * even number within 0 to that given number input / parameter = int number
	 * output and return type = int serving bucket = variable
	 */
	public static int getEvebNumCount(int number){
		int count = 0;
		for (int i = 0; i<=number ; i++ ){
			if (i % 2 == 0){
				count++;
			}
		}
	return count ; 	
	}
	
	/**
	 * Qua 12. write a method that takes one number input and return an Array that contains 0 to given number .
	 *  input / parameter = int number
	 *   output / return type = Array ; 
	 *   serving bucket = Array
	 */
	public static int [] getNumArray (int number){
		int [] numArray = new int[number+1];
		for (int i = 0; i<=number ; i++ )
			numArray[i] = i;
		return numArray;
	}
	
	/**
	 * Qua 11. Write a method that take a number input and return square of that number .
	 *  input / Parameter = int number 
	 *  output / Retutn type = int SquareNum 
	 *  Serving bucket / Container = Variable.
	 */
	public static int getSquare(int number) {
		int squareNum = 0;
		for (int i = 0; i <= number; i++) {
			squareNum = i * i;
		}
		return squareNum;
	}
	
	/**
	 * Qua 10 .Write a method that take one number input and return sum of 1 to given number Accept 8 (Eight) . 
	 * input / parameter = int number
	 *  output / return type = int num
	 *   serving bucket = variable
	 */
	public static int getSumAcceptEight(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			if (i != 8) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	/**
	 * Qua 9. write a method that take a String input and return a character of all index 
	 * input parameter = String text 
	 * output /return type = ArrayList <Character> allChar 
	 * service bucket / Container = List
	 */
	public static ArrayList <Character> getallChar(String text){
		ArrayList <Character> allChar = new ArrayList <Character>();
		for ( int i = 0; i< text.length(); i++){
			allChar.add(text.charAt(i));
		}
		return allChar;
	}
	
	/**
	 * Qua 8. write a method that take a String input and return a list of all
	 * index input parameter = String text 
	 * output /return type = ArrayList <Integer> allIndex 
	 * service bucket / Container = List
	 */
	public static ArrayList <Integer> getAllIndexList (String text){
		ArrayList <Integer> allIndexList = new ArrayList <Integer>();
		for(int i = 0; i<= text.length(); i++){
			allIndexList.add(i);
		}
		
		return allIndexList;
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
