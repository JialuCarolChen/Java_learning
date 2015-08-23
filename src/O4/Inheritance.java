package O4;

import O2.Sex;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by carolchen on 8/08/2015.
 */
public class Inheritance {
    public static void main(String[] args) {
        Human bob = new Human("Bob", O4.Sex.MALE);
        Dog zee = new Dog("Zee", O4.Sex.FEMALE);
        Animal carol = new Human("carol", O4.Sex.FEMALE);
        FruitBat oliver = new FruitBat("Oliver", O4.Sex.MALE);
        EasternBrownSnake toad = new EasternBrownSnake("Toad", O4.Sex.MALE);
        GreatWhiteShark jaws = new GreatWhiteShark("Jaws", O4.Sex.MALE);
        Albotross poppy = new Albotross("Poppy", O4.Sex.MALE);
        FunnelWebSpider sid = new FunnelWebSpider("Sid", O4.Sex.FEMALE);
        Platypus pig = new Platypus("Pig", O4.Sex.FEMALE);
        Animal[] animals = {bob, zee, carol, oliver, toad, jaws, poppy, sid, pig};

        System.out.println("Here is the animals we know about:");
        for(Animal a : animals) {
            System.out.println(a);
        }

        System.out.println("These animals are poisonous: ");
        for(Animal a: animals) {
            if(a instanceof Poisonous) {
                System.out.println(a);
            }
        }

    }
}
