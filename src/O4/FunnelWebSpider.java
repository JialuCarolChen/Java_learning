package O4;

/**
 * Created by carolchen on 8/08/2015.
 */
public class FunnelWebSpider extends Insect implements Poisonous {
    public FunnelWebSpider(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return false;
    }
}
