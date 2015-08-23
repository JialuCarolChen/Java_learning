package O3;

import O1.Objects;

/**
 * Created by carolchen on 8/08/2015.
 */
public class Interfaces {
    public static void main(String[] args) {
        Cyanide oliver = new Cyanide();
        FunnelWebSpider carol = new FunnelWebSpider();
        Dog zeezee = new Dog();

        Object[] things = {oliver, carol, zeezee};

        for(Object t: things) {
            if(t instanceof Poisonous) {System.out.println(((Poisonous) t).isLethalToAdultHumans());
        } else {
            System.out.println(true);
        }

    }}
}
