package J14forEachOrderingCollections;

import O2.Sex;
import O2.comp1110Student;
import O2.Person;
import O2.Grade;

import java.util.*;

/**
 * Created by carolchen on 24/08/2015.
 */
public class ClassList {
    public static void main(String[] args) {
        comp1110Student stuarray[] = {new comp1110Student("carol", 21, Sex.FEMALE, "u5426135", 100, 10, 10, 5, 25),
                new comp1110Student("oliver", 22, Sex.MALE, "u5426136", 100, 10, 10, 5, 25),
                new comp1110Student("james", 20, Sex.MALE, "u5426139", 0, 10, 10, 5, 0)};


        List<comp1110Student> students = new ArrayList<comp1110Student>(Arrays.asList(stuarray));

        Map<String, comp1110Student> uidmap = new HashMap<String, comp1110Student>();
        for (comp1110Student student: students) {
            uidmap.put(student.getUid(), student);
        }

        //do a query
        String key = "u5426135";
        comp1110Student value = uidmap.get(key);
        System.out.println("Found: "+value);

        //print all students in map
        System.out.println("All student in map");
        for (comp1110Student student: uidmap.values()) {
            System.out.println(student);
        }

        //add new student
        //if you want to update the value, you can put a key which is the same as the value that you want to change
        //One key can only map one value
        uidmap.put("u3627634", new comp1110Student("kate", 23, Sex.FEMALE, "u3627634", 23, 13, 23, 3, 23));
        System.out.println("New student is added in map");
        for (comp1110Student student: uidmap.values()) {
            System.out.println(student);
        }

        //create a list which stores the values in map
        students = new ArrayList<>(uidmap.values());
        System.out.println("All student in list");
        for (comp1110Student student: students) {
            System.out.println(student);
        }

        //Print all students in list in their natural order
        System.out.println("All students in list in natural order: ");
        Collections.sort(students);
        students.forEach((student) -> System.out.println(student));

        //Print all the students in List according to their mark ordering
        System.out.println("All students in list in mark order:");
        Collections.sort(students, (comp1110Student s1, comp1110Student s2) -> {
            return s1.mark() - s2.mark();
        });
        students.forEach((student) -> System.out.println(student));

        //Print all the students in List according to their age
        System.out.println("All students in age order:");
        Collections.sort(students, (comp1110Student s1, comp1110Student s2) -> {
            return s1.getAge() - s2.getAge();
        });
        students.forEach((student) -> System.out.println(student));

        //Print all the students in Grade order
        System.out.println("All students in grade order:");
        Collections.sort(students, (comp1110Student s1, comp1110Student s2) -> {
            return Grade.fromMark(s1.mark()).ordinal() - Grade.fromMark(s2.mark()).ordinal() ;
        });
        students.forEach((student) -> System.out.println(student));

    }
}
