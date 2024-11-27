package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Buffalo extends Herbivore {

    public Buffalo() {super(Entity.BUFFALO);}

    public Buffalo(Cell cell) {super(cell, Entity.BUFFALO);}

    @Override
    public Animal born() {return new Buffalo(getCell());}

}
