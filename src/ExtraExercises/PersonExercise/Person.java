package ExtraExercises.PersonExercise;

public class Person {
    //Attributes/Fields
    private String name;
    private int age;

    //Constructor (for create a person object)
    // this.name references to the attribute name above, which is put in the object 'Person'
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // This can be like adding name and age to one person.

    //Getters. Used whenever there is private attributes.
    //Public attributes can use this aswell, that's like call the name of one person. "Person 1, what's your name?" kind of.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // used for public attributes, could also be used for private.
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Age: " + age;
    }
    /*
    @Override-annotationen:

     */
}
