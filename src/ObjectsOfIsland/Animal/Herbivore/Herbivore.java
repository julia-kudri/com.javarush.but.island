package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;
import src.ObjectsOfIsland.Plant.Plant;

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
                    System.out.println(getName() + " пощипал " + food.getName() );
                    food.die();
                }
            }
    }
}
