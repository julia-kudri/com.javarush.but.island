package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Buffalo extends Herbivore {

    public Buffalo() {super(Entity.BUFFALO);}

    public Buffalo(Cell cell) {super(cell, Entity.BUFFALO);}

    @Override
    public Animal born() {return new Buffalo(getCell());}

}
