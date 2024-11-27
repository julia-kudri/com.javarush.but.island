package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Rabbit extends Herbivore {

    public Rabbit() {super(Entity.RABBIT);}

    public Rabbit(Cell cell) {super(cell, Entity.RABBIT);}

    @Override
    public Animal born() {return new Rabbit (getCell());}
}
