import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rabbit r = new Rabbit();
        r.eatPlants();

        Herbivore h = new Rabbit();
        h.eatPlants();

        Tiger t = new Tiger();
        t.eatMeat();

        Bear b = new Bear();
        b.getWeight();

        List<Carnivore> meatLovers = new ArrayList<>(List.of(t, b));
//        meatLovers.add(t);
//        meatLovers.add(b);
        // MAG NIET meatLovers.add(r);


    }
}
