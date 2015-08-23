package O4;

/**
 * Created by carolchen on 8/08/2015.
 */
public class Platypus extends Monotreme implements Poisonous {
    public Platypus(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return false;
    }
}
