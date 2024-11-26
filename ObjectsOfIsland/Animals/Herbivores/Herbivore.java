package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;
import Entity.Plants.Plant;

public abstract class Herbivore extends Animal {

    public Herbivore(Entity entity) {super(entity);}

    public Herbivore(Cell cell, Entity entity) {super(cell, entity);}

    @Override
    public synchronized void eat() {
        if (getSatiety() < getWeightForLife())
            for (int i = 0; i < getCell().getPlantsInCell().size(); i++) {
                if (getSatiety() < getWeightForLife()) {
                    Plant food = getCell().getPlantsInCell().get(i);
                    double oldSatiety =  getSatiety();
                    double newSatiety = oldSatiety + food.getWeight();
                    if (newSatiety > getWeightForLife())
                        newSatiety = getWeightForLife();
                    setSatiety(newSatiety);
                    if (newSatiety != oldSatiety)
                        food.setWeight(food.getWeight() - (newSatiety - oldSatiety));
                    System.out.println(getName() + " поел " + "\\uD83E\\uDD57 " + food.getName() );
                    food.die();
                }
            }
    }
}
