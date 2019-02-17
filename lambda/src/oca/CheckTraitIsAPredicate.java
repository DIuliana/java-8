package oca;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckTraitIsAPredicate {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //use lambda for checking the hopping animals
        print(animals, a -> a.canHop());
        //use lambda for checking the swimming animals
        print(animals, a -> a.canSwim());

    }

    private static void print(List<Animal> animals, Predicate<Animal> predicate) {
        for (Animal animal : animals) {
            if (predicate.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }

}



