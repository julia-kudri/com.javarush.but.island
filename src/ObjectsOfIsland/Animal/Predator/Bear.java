package ObjectsOfIsland.Animal.Predator;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Bear extends Predator{
    public Bear() {
        super(Entity.BEAR);
    }

    public Bear(Cell cell) {
        super(cell, Entity.BEAR);
    }

    @Override
    public int chanceOfEat(Entity entity) {
        int chance;
        switch (entity){
            case BOA  -> chance = 80;
            case HORSE  -> chance = 40;
            case DEER -> chance = 80;
            case RABBIT  -> chance = 80;
            case MOUSE -> chance = 90;
            case GOAT -> chance = 70;
            case SHEEP -> chance = 70;
            case BOAR -> chance = 50;
            case BUFFALO -> chance = 20;
            case DUCK -> chance = 10;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {return new Bear(getCell());}
}
