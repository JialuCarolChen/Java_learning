package O1;

/**
 * Created by carolchen on 31/07/2015.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + ", aged " + age;
    }
}
