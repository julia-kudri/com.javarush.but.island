package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Sheep extends Herbivore {

    public Sheep() {super(Entity.SHEEP);}

    public Sheep(Cell cell) {super(cell, Entity.SHEEP);}

    @Override
    public Animal born() {return new Sheep(getCell());}
}
