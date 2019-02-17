package oca;

public class CheckIfHopper implements CheckTrait {

    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
