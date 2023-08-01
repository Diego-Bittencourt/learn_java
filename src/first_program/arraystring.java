package first_program;

public class arraystring {
    public static void main(String[] args) {


        //initiate the array
        String[] words = new String[3];

        //keep in mind that a String is not a primitive type
        //therefore the words variable holds an array of pointers
        //and each element is a pointer itself

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you.";

        //create and assign the values at the same time
        String[] fruits = {"melon", "apple", "kiwi"};

        //another way to iterate through the array
        //You can declare a variable in the () and tell which array to iterate
        for(String fruit: fruits) {
            System.out.println(fruit);
        };
    }
}
