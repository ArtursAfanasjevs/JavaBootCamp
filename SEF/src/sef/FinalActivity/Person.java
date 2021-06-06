package sef.FinalActivity;


public class Person {

    String firstName;
    int age;

    public Person(){
    this.firstName=null;
    this.age=0;
    }

    //parametized consturcotor with custom expection
    public Person(String firstName, int age) throws CustomException{
        if(!firstName.matches("[a-zA-Z]+")) {
            throw new CustomException("Firstname can only contain letters: " + firstName);
        }else{
            this.firstName = firstName;
            this.age = age;
            System.out.println("You've created a valid person!");
        }
    }

    public void introMsg(){
        System.out.println("My name is " + this.firstName+" and I am "+this.age+" years old!");
    }

    public static void main(String[] args) throws CustomException {
        Person Artur = new Person();
        Artur.firstName="Arturs";
        Artur.age=35;

        //testing exception
        Person Dude = new Person("Clown4",66);
        Artur.introMsg();
    }
}