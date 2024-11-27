
import java.util.Random;
import src.ObjectsOfIsland;

public abstract class LivingObject {
    private Cell cell;
    private double weight;
    private String name;
    private Entity entity;
    public int x, y;
    public int indexOfCell;

    public LivingObject (Entity entity) {
        this.entity = entity;
        x = (new Random().nextInt(Island.xLenght)) + 1;
        y = (new Random().nextInt(Island.yLenght)) + 1;
        indexOfCell = ((Island.xLenght) * (y-1) + x) - 1;
        this.cell =  Island.cellList.get(indexOfCell);
        this.weight = entity.getWeight();
        this.name = entity.getName() + hashCode();
    }
    public LivingObject (Cell cell, Entity entity) {
        this.cell = cell;
        this.weight = entity.getWeight();
        this.name = entity.getName() + hashCode();
        this.entity = entity;
        x = cell.getX();
        y = cell.getY();
        indexOfCell = ((Island.xLenght) * (y-1) + x) - 1;
    }

    public abstract void die();

    public Cell getCell() {return cell;}

    public void setCell(Cell cell) {this.cell = cell;}

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Entity getEntity() {return entity;}

    public void setEntity(Entity species) {this.entity = species;}

    @Override
    public String toString() {
        return  '{' + name +
                ", клетка = " + cell +
                ", вес = " + weight +
                ", существо = " + entity +
                '}';
    }
}
