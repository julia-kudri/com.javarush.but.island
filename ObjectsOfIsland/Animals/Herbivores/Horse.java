package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Horse extends Herbivore{

    public Horse() {super(Entity.HORSE);}

    public Horse(Cell cell) {super(cell, Entity.HORSE);}

    @Override
    public Animal born() {return new Horse(getCell());}
}
