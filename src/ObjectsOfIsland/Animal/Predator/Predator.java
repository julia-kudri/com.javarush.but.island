package src.ObjectsOfIsland.Animal.Predator;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Entity;
import src.ObjectsOfIsland.Island;
import src.ObjectsOfIsland.Cell;

import java.util.Random;

public abstract class Predator extends Animal {

    int chance;

    public Predator(Entity entity) {super(entity);}

    public Predator(Cell cell, Entity entity) {super(cell, entity);}

    public int chanceOfEat(Entity entity) {return chance;}

    @Override
    public synchronized void eat() {
        if (getSatiety() < getWeightForLife()){
            for (int i =0; i<getCell().getAnimalsInCell().size(); i++){
                if (getSatiety() < getWeightForLife()){
                    int j =  new Random().nextInt(100) + 1;
                    Animal food = getCell().getAnimalsInCell().get(i);
                    chance = chanceOfEat (food.getEntity());
                    if (j <= chance){
                        double newSatiety = getSatiety() + food.getWeight();
                        if (newSatiety > getWeightForLife())
                            newSatiety = getWeightForLife();
                        setSatiety(newSatiety);
                        Island.animals.remove(food);
                        getCell().getAnimalsInCell().remove(food);
                        System.out.println(getName() + " съел " + food.getName() );
                    }
                }}
        }
    }
}
