package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Deer extends Herbivore {
    public Deer() {super(Entity.DEER);}

    public Deer(Cell cell) {super(cell, Entity.DEER);}

    @Override
    public Animal born() {return new Deer(getCell());}

}
