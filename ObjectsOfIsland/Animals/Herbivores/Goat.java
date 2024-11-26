package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Goat extends Herbivore{

    public Goat() {super(Entity.GOAT);}

    public Goat(Cell cell) {super(cell, Entity.GOAT);}

    @Override
    public Animal born() {return new Goat(getCell());}
}
