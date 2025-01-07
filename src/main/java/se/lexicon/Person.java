package se.lexicon;

public class Person {

    String firstName;
    String lastName;
    int age;
    String hobby;

    //Methods

    public String fullName(){
        return firstName + "" + lastName;
    }
}
