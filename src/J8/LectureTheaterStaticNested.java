package J8;

/**
 * Created by carolchen on 8/08/2015.
 */
public class LectureTheaterStaticNested {
    String name;
    Projector projector;

    public LectureTheaterStaticNested(String name, String projectorModel, boolean projectorHD) {
        this.name = name;
        this.projector = new Projector(projectorModel, projectorHD, this);

    }

    static public class Projector {
        private String model;
        private boolean hd;
        private LectureTheaterStaticNested room;
        //because is static nested, we need to give a instance variable of LectureTheater,
        //to declare that the projector is in this room
        public Projector(String model, boolean hd, LectureTheaterStaticNested room) {
            this.room = room;
            this.model = model;
            this.hd = hd;
        }

        @Override
        public String toString() {
            return "Model: " + model + " is hd? " + hd + ", in room: " + room.name;
        }
    }






    public String toString() {
        return "Room: " + name + ", has projector " + projector;
    }


}
