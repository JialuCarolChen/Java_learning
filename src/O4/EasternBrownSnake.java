package O4;

/**
 * Created by carolchen on 8/08/2015.
 */
public class EasternBrownSnake extends Reptiles implements Poisonous {
    public EasternBrownSnake(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return false;
    }
}
