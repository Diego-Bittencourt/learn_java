package first_program;

import java.util.Scanner;
public class loops {
  

	public static void main(String[] args) {

		double value = 0;
		
		//while loop works like in javascript
		while(value < 10)
		{
			
			System.out.println(value);
			value = value + 0.1;
		}
		
		//for loops receives three parts, just like javascript
		//the first runs before the loop, the second is the conditional and the last part runs after each iteration
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		Scanner scanner = new Scanner(System.in);
		int uservalue = 0;

		do {
			System.out.println("Enter a number");
			uservalue = scanner.nextInt();
		} 
		while (uservalue != 5); 
			System.out.println("Got 5!");
		
	}
}



