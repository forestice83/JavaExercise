package github.exercise;

public class GitJavaFile {

	public static void main(String[] args) {
		String name = " This is Md Chowdhury";
		int num = 32;
		String age = name + "i am " + num + " years old";
		System.out.println(age);

		String country = " My country Name Is Bangladesh";
		System.out.println(country);
		System.out.println(getMyName("Ans 1." + name));

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
