package Entity.Animals.Predators;


import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Fox extends Predator {

    public Fox() {super(Entity.FOX);}

    public Fox(Cell cell) {super(cell, Entity.FOX);}

    @Override
    public int chanceOfEat(Entity entity) {
        int chance;
        switch (entity){
            case RABBIT  -> chance = 70;
            case MOUSE -> chance = 90;
            case DUCK -> chance = 60;
            case CATERPILLAR -> chance = 40;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {return new Fox(getCell());}
}
