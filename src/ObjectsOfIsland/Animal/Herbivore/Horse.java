package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Horse extends Herbivore{

    public Horse() {super(Entity.HORSE);}

    public Horse(Cell cell) {super(cell, Entity.HORSE);}

    @Override
    public Animal born() {return new Horse(getCell());}
}
