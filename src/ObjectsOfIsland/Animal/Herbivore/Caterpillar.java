package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Caterpillar extends Herbivore {
    public Caterpillar() {super(Entity.CATERPILLAR);}

    public Caterpillar(Cell cell) {super(cell, Entity.CATERPILLAR);}

    @Override
    public Animal born() {return new Caterpillar(getCell());}

    @Override
    public void move() {}
}
