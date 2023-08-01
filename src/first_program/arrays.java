package first_program;

public class arrays {
    public static void main(String[] args) {

        //create an array of integers
        int[] values;

        //using the new keyword to create the new array
        //the number in the brackets is the length of the array
        values = new int[5];

        //printing out the first value in the array
        //since the first value is not defined, it prints 0 because it is an int array
        System.out.println(values[0]);

        //changing the value
        values[0] = 5;

        //printing the new value
        System.out.println(values[0]);

        //assigning int to value were not defined when the array was created
        values[1] = 10;
        values[2] = 15;
        values[4] = 20;

        System.out.println(values.length);
        // using a for loop the print the elements in the array
        for(int i = 0; i < values.length; i++) {
            //the values[3] element was not defined, therefore it prints 0
            System.out.println(values[i]);
        }
        

        //you can also declare and create the array at the same time using the syntax below
        int[] numbers = {1, 2, 3, 4};
        //note that we use curly braces instead of brackets, like we do in Javascript
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



    }
}
