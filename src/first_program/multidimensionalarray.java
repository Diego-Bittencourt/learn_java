package first_program;

public class multidimensionalarray {
    public static void main(String[] args) {

        //a bidimensional array is just an array of arrays
        int [][] grid = {
            {3,  5, 234},
            {2, 4},
            {55, 1, 322, 35}
        };

        //to access an element
        int number = grid[2][2];

        System.out.println(number);


        String[][] texts = new String[2][4];

        texts[0][1] = "Hello world.";

        System.out.println(texts[0][1]);

        //the element below was not assigning, therefore returns null because is the default type of an pointer.
        System.out.println(texts[0][0]);

        for(int row = 0; row < texts.length; row++) {
            //loop through the inner arrays
            for(int col = 0; col < texts[row].length; col++) {
                System.out.println(texts[row][col]);
            }
        }

    }
}
