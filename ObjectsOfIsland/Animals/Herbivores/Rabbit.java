package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Rabbit extends Herbivore {

    public Rabbit() {super(Entity.RABBIT);}

    public Rabbit(Cell cell) {super(cell, Entity.RABBIT);}

    @Override
    public Animal born() {return new Rabbit (getCell());}
}
