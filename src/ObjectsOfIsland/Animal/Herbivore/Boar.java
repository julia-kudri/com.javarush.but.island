package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Boar extends Herbivore {
    public Boar() {super(Entity.BOAR);}

    public Boar(Cell cell) {super(cell, Entity.BUFFALO);}

    @Override
    public Animal born() {return new Boar(getCell());}
}

