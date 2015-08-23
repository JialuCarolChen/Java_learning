package J8;

/**
 * Created by carolchen on 8/08/2015.
 */
public class LectureTheater {
    String name;
    Projector projector;

    public LectureTheater(String name, String projectorModel, boolean projectorHD) {
        this.name = name;
        this.projector = new Projector(projectorModel, projectorHD, this);

    }

    public String toString() {
        return "Room: " + name + ", the projector is " + projector;
    }





}
