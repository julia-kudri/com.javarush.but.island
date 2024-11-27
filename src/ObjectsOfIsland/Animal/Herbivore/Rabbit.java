package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Rabbit extends Herbivore {

    public Rabbit() {super(Entity.RABBIT);}

    public Rabbit(Cell cell) {super(cell, Entity.RABBIT);}

    @Override
    public Animal born() {return new Rabbit (getCell());}
}
