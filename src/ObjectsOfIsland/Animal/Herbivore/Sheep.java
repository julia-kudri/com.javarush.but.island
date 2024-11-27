package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Sheep extends Herbivore {

    public Sheep() {super(Entity.SHEEP);}

    public Sheep(Cell cell) {super(cell, Entity.SHEEP);}

    @Override
    public Animal born() {return new Sheep(getCell());}
}
