package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Buffalo extends Herbivore {

    public Buffalo() {super(Entity.BUFFALO);}

    public Buffalo(Cell cell) {super(cell, Entity.BUFFALO);}

    @Override
    public Animal born() {return new Buffalo(getCell());}

}
