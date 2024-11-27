package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Caterpillar extends Herbivore {
    public Caterpillar() {super(Entity.CATERPILLAR);}

    public Caterpillar(Cell cell) {super(cell, Entity.CATERPILLAR);}

    @Override
    public Animal born() {return new Caterpillar(getCell());}

    @Override
    public void move() {}
}
