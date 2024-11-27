package ObjectsOfIsland.Animal.Predator;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Eagle extends Predator{


    public Eagle() {super(Entity.EAGLE);}

    public Eagle(Cell cell) {super(cell, Entity.EAGLE);}

    @Override
    public int chanceOfEat(Entity entity) {
        int chance;
        switch (entity){
            case FOX  -> chance = 10;
            case RABBIT  -> chance = 90;
            case MOUSE -> chance = 90;
            case DUCK  -> chance = 80;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {return new Eagle(getCell());}
}
