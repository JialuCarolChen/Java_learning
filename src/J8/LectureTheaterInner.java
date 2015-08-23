package J8;

/**
 * Created by carolchen on 8/08/2015.
 */
public class LectureTheaterInner {
    String name;
    ProjectorInner projectorInner;

    public LectureTheaterInner(String name, String projectorModel, boolean projectorHD) {
        this.name = name;
        this.projectorInner = new ProjectorInner(projectorModel, projectorHD, this);

    }

    public String toString() {
        return "Room: " + name + ", the projector is " + projectorInner;
    }

    public class ProjectorInner {
        private String model;
        private boolean hd;
        public ProjectorInner(String model, boolean hd, LectureTheaterInner room) {
            this.model = model;
            this.hd = hd;
        }

        @Override
        public String toString() {
            return "Model: " + model + " is hd? " + hd + ", in room: " + name;
            //because is inner nested, we can directly use instance variable "name" here
        }
    }




}
