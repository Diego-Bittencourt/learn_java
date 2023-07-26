package first_program;

public class strings {

	
	//every application in Java must have a main method where the application starts
	
	public static void main(String[] args) {
		
		int myInt = 7;
		
		//string is not a primitive type therefore S is capital
		String text = "Hello";
		
		String blank = " ";
			
		String name = "Bob";	
		
		//to concatenate strings, can use the + operator
		String greeting = text + blank + name;
		
		System.out.println(greeting);
		
		//when using the + operator between an int and a string, they concatenate
		System.out.println("1" + myInt);
	}
}
