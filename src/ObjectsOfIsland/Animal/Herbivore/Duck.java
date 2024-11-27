package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;
import ObjectsOfIsland.Plant.Plant;
import ObjectsOfIsland.Island;

import java.util.Random;

public class Duck extends Herbivore {

    public Duck() {super(Entity.DUCK);}

    public Duck(Cell cell) {super(cell, Entity.DUCK);}

    @Override
    public synchronized void eat() {
        if (getSatiety() < getWeightForLife()) {
            for (int i = 0; i < getCell().getPlantsInCell().size(); i++) {
                if (getSatiety() < getWeightForLife()){
                    Plant plant = getCell().getPlantsInCell().get(i);
                    double oldSatiety = getSatiety();
                    double newSatiety = oldSatiety + plant.getWeight();
                    if (newSatiety > getWeightForLife())
                        newSatiety = getWeightForLife();
                    setSatiety(newSatiety);
                    if (newSatiety != oldSatiety)
                        plant.setWeight(newSatiety - oldSatiety);
                    System.out.println(getName() + " поел " + "\\uD83E\\uDD57 " + plant.getName());
                    plant.die();
                }}

            for (int i = 0; i < getCell().getAnimalsInCell().size(); i++) {
                int j = new Random().nextInt(100) + 1;
                Animal food = getCell().getAnimalsInCell().get(i);
                int chance = chanceOfEat(food.getEntity());
                if (j <= chance) {
                    double newSatiety = getSatiety() + food.getWeight();
                    if (newSatiety > getWeightForLife())
                        newSatiety = getWeightForLife();
                    setSatiety(newSatiety);
                    Island.animals.remove(food);
                    getCell().getAnimalsInCell().remove(food);
                    System.out.println(getName() + " съел " + "\\uD83E\\uDD53 " + food.getName());
                }
            }
        }     }

    public int chanceOfEat(Entity entity) {
        int chance;
        switch (entity){
            case CATERPILLAR  -> chance = 90;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {return new Duck(getCell());}
}
