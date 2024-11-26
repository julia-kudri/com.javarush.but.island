package Entity.Plants;

import Entity.Animals.Entity;
import Entity.LivingObject;
import Entity.Island;

public class Plant extends LivingObject {
    public Plant () {
        super(Entity.PLANT);
        Island.cellList.get(indexOfCell).getPlantsInCell().add(Plant.this);
        Island.plants.add(Plant.this);
    }

    @Override
    public void die() {
        if (getWeight() <= 0) {
            Island.plants.remove(Plant.this);
            getCell().getPlantsInCell().remove(Plant.this);
            System.out.println(getName() + " погиб " + "\\u274C");
        }
    }
}
