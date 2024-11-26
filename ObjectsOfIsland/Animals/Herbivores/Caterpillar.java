package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Caterpillar extends Herbivore {
    public Caterpillar() {super(Entity.CATERPILLAR);}

    public Caterpillar(Cell cell) {super(cell, Entity.CATERPILLAR);}

    @Override
    public Animal born() {return new Caterpillar(getCell());}

    @Override
    public void move() {}
}
