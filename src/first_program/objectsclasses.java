package first_program;

class Person {
    //class can contain data that hold the state of the object
    //method can be called subroutines in Java

    //data or state
    String name;
    int age;
}


public class objectsclasses {
    public static void main(String[] args) {
        //a class that is set as public, must have the same name as the file
        //while you can only have one public class in a file
        //you can have many non-public classes


        //using the class declared above to create an object
        Person joana = new Person();
        joana.age = 27;
        joana.name = "Joana da Silva";


        Person joilson = new Person();
        joilson.name = "Joilson da Silva";
        joilson.age = 19;

    }
}
