package J8;

/**
 * Created by carolchen on 8/08/2015.
 */
public class Projector {
    private String model;
    private boolean hd;
    private LectureTheater room;
    public Projector(String model, boolean hd, LectureTheater room) {
        this.room = room;
        this.model = model;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Model: " + model + " is hd? " + hd + ", in room: " + room.name;
    }
}
