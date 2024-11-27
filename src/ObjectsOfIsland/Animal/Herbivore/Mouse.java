package src.ObjectsOfIsland.Animal.Herbivore;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;

public class Mouse extends Herbivore {

    public Mouse() {super(Entity.MOUSE);}

    public Mouse(Cell cell) {super(cell, Entity.MOUSE);}

    @Override
    public Animal born() {return new Mouse(getCell());}
}
