package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Horse extends Herbivore{

    public Horse() {super(Entity.HORSE);}

    public Horse(Cell cell) {super(cell, Entity.HORSE);}

    @Override
    public Animal born() {return new Horse(getCell());}
}
