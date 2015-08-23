package J8;

/**
 * Created by carolchen on 8/08/2015.
 */
public class Nesting {
    public static void main(String[] args) {
        LectureTheater chemT = new LectureTheater("ChemT", "super", true);
        LectureTheaterStaticNested chemT1 = new LectureTheaterStaticNested("ChemT1", "cool", true);
        System.out.println("Two Classes: "+chemT);
        System.out.println("Two Classes nested statically: "+chemT1);

    }
}
