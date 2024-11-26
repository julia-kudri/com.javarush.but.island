package Objects.Animals.Predators;

import Objects.Animals.Animal;

import java.util.stream.Collectors;

public abstract class Predator extends Animal {
    public void predatorEat(Animal animal, Location location) {
        ArrayList<IslandObject> objects = location.animals.stream()
                .filter(a -> (a instanceof Herbivores) || isAnimalCanBeEaten(animal, a))
                .collect(Collectors.toCollection(ArrayList::new));
        super.eat(animal, location, objects);
    }
}
