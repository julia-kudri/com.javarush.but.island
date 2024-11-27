package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Sheep extends Herbivore {

    public Sheep() {super(Entity.SHEEP);}

    public Sheep(Cell cell) {super(cell, Entity.SHEEP);}

    @Override
    public Animal born() {return new Sheep(getCell());}
}
