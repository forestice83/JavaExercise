package exercisePackage;

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
		System.out.println(getEvenList(20));
		

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
	 */
	public static ArrayList<Integer> getEvenList(int number) {
		ArrayList<Integer> evenNumList = new ArrayList<Integer>();
		for (int i = 0; i <= number; i = i + 2) {
			evenNumList.add(i);
		}

		return evenNumList;
	}

}
