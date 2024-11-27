package ObjectsOfIsland.Plant;

import ObjectsOfIsland.Entity;
import ObjectsOfIsland.LivingObject;
import ObjectsOfIsland.Island;

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
