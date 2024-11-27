package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Deer extends Herbivore {
    public Deer() {super(Entity.DEER);}

    public Deer(Cell cell) {super(cell, Entity.DEER);}

    @Override
    public Animal born() {return new Deer(getCell());}

}
