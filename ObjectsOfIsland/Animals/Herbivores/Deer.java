package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Deer extends Herbivore {
    public Deer() {super(Entity.DEER);}

    public Deer(Cell cell) {super(cell, Entity.DEER);}

    @Override
    public Animal born() {return new Deer(getCell());}

}
