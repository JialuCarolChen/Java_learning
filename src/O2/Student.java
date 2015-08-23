package O2;

/**
 * Created by carolchen on 31/07/2015.
 */
public class Student extends Person {
    private String uid;

    public Student(String name, int age, Sex sex, String uid) {
        super(name, age, sex);
        this.uid=uid;
    }

    public String getUid() {return uid; }

    public String toString() {
        return super.toString() + ", has uid: "+uid;
    }
}
