package github.exercise;

import java.util.ArrayList;

public class GitJavaFile {

	public static void main(String[] args) {
		String name = " This is Md Chowdhury";
		int num = 32;
		String age = name + "i am " + num + " years old";
		System.out.println(age);

		String country = " My country Name Is Bangladesh";
		System.out.println(country);
		System.out.println(getMyName("Ans 1." + name));
		System.out.println("Ans 2." + getEvenNumberList(num));

	}
	/**
	 * Qua 1.Write a method that take your name and return your name
	 */
	public static String getMyName(String name) {
		String myName = "";
		myName = myName + name;

		return myName;
	}

	/**
	 * Que 2. Write a Method that take a Number input and return the list of all
	 * even number 0 to given number 
	 * input / parameter = int Number
	 *  output return type = ArrayList<Integer> 
	 *  Serving bucket Container = list
	 */
	public static ArrayList<Integer> getEvenNumberList(int number) {
		ArrayList<Integer> evenNum = new ArrayList<Integer>();
		for (int i = 0; i <= number; i= i+2) {
			//if (i % 2 == 0);
			evenNum.add(i);
		}
		return evenNum;
	}
}
