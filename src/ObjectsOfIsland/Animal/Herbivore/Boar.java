package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Boar extends Herbivore {
    public Boar() {super(Entity.BOAR);}

    public Boar(Cell cell) {super(cell, Entity.BUFFALO);}

    @Override
    public Animal born() {return new Boar(getCell());}
}

