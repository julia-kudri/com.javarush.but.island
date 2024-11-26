package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Boar extends Herbivore {
    public Boar() {super(Entity.BOAR);}

    public Boar(Cell cell) {super(cell, Entity.BUFFALO);}

    @Override
    public Animal born() {return new Boar(getCell());}
}

