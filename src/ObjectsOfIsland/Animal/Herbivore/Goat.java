package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Goat extends Herbivore{

    public Goat() {super(Entity.GOAT);}

    public Goat(Cell cell) {super(cell, Entity.GOAT);}

    @Override
    public Animal born() {return new Goat(getCell());}
}
