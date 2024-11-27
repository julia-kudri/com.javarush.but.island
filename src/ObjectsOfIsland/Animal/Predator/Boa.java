package ObjectsOfIsland.Animal.Predator;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Boa extends Predator {

    public Boa() {super(Entity.BOA);}

    public Boa(Cell cell) {super(cell, Entity.BOA);}

    @Override
    public int chanceOfEat(Entity entity) {
        int chance;
        switch (entity){
            case FOX  -> chance = 15;
            case RABBIT  -> chance = 20;
            case MOUSE -> chance = 40;
            case DUCK -> chance = 10;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {return new Boa(getCell());}
}
