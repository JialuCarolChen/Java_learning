package O2;

/**
 * Created by carolchen on 31/07/2015.
 */
public class Person {
    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString() {
        return name+", who is "+sex+", aged "+age;
    }
}
