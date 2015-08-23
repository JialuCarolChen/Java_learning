package O4;

/**
 * Created by carolchen on 8/08/2015.
 */
public class Animal {
    String name;
    Sex sex;

    public Animal(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String toString() {
        return name + ", " +sex+ " "+ getClass().getSimpleName();
    }

}
