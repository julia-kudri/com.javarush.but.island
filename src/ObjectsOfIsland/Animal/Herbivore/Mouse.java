package ObjectsOfIsland.Animal.Herbivore;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Cell;
import ObjectsOfIsland.Entity;

public class Mouse extends Herbivore {

    public Mouse() {super(Entity.MOUSE);}

    public Mouse(Cell cell) {super(cell, Entity.MOUSE);}

    @Override
    public Animal born() {return new Mouse(getCell());}
}
