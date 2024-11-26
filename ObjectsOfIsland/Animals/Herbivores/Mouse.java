package Entity.Animals.Herbivores;

import Entity.Animals.Animal;
import Entity.Animals.Entity;
import Entity.Cell;

public class Mouse extends Herbivore {

    public Mouse() {super(Entity.MOUSE);}

    public Mouse(Cell cell) {super(cell, Entity.MOUSE);}

    @Override
    public Animal born() {return new Mouse(getCell());}
}
