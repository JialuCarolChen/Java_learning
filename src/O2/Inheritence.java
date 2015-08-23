package O2;

/**
 * Created by carolchen on 31/07/2015.
 */
public class Inheritence {
    public static void main(String[] args) {
        Person fred = new Person("Fred", 21, Sex.MALE);
        Student mary = new Student("mary", 20, Sex.FEMALE, "u732846");
        comp1110Student carol = new comp1110Student("carol", 21, Sex.FEMALE, "u5426135", 100, 10, 10, 5, 25);
        System.out.println("I know about "+fred);
        System.out.println("I know about "+mary);
        System.out.println("I know about "+carol);
    }
}
