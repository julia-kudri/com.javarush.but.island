package Objects.Animals.Herbivores;

import Objects.Animals.Animal;

import java.util.ArrayList;

public abstract class Herbivore extends Animal {
    public void herbivoresEat(Animal animal, Location location) {
        ArrayList<IslandObject> objects = new ArrayList<>();
        objects.addAll(location.plants);
        objects.addAll(location.animals.stream()
                .filter(a -> (a instanceof Herbivores) && isAnimalCanBeEaten(animal, a))
                .collect(Collectors.toCollection(ArrayList::new)));
        super.eat(animal, location, objects);
    }
}
