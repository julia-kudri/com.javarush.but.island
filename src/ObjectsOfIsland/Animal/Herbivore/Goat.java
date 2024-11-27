package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Goat extends Herbivore{

    public Goat() {super(Entity.GOAT);}

    public Goat(Cell cell) {super(cell, Entity.GOAT);}

    @Override
    public Animal born() {return new Goat(getCell());}
}
