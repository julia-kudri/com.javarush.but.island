package src.ObjectsOfIsland.Animal;

import src.ObjectsOfIsland.Cell;
import src.ObjectsOfIsland.Entity;
import src.ObjectsOfIsland.Island;
import src.ObjectsOfIsland.LivingObject;

import java.util.Random;

public abstract class Animal extends LivingObject {
    private Sex sex;
    private int maxSpeed;
    private int maxCountInCell;
    private double weightForLife;
    private double satiety;

    public abstract void eat();
    public abstract Animal born ();

    public Animal(Entity entity) {
        super(entity);
        int i =  new Random().nextInt(2);
        if (i == 1) {
            sex = Sex.FEMALE ;
        }
        else sex = Sex.MALE;
        this.maxSpeed = entity.getMaxSpeed();
        this.maxCountInCell = entity.getMaxCountInCell();
        this.weightForLife = entity.getWeightForLife();
        this.satiety = entity.getSatiety();
        Island.cellList.get(indexOfCell).getAnimalsInCell().add(Animal.this);
        Island.animals.add(Animal.this);
    }

    public Animal(Cell cell, Entity entity) {
        super(cell, entity);
        int i =  new Random().nextInt(2);
        if (i == 1) {
            sex = Sex.FEMALE ;
        }
        else sex = Sex.MALE;
        this.maxSpeed = entity.getMaxSpeed();
        this.maxCountInCell = entity.getMaxCountInCell();
        this.weightForLife = entity.getWeightForLife();
        this.satiety = entity.getSatiety();
        Island.cellList.get(indexOfCell).getAnimalsInCell().add(Animal.this);
        Island.animals.add(Animal.this);
    }

    public synchronized void reproduce (){
        Animal child;
        if (sex.equals(Sex.FEMALE) &
                Island.cellList.get(indexOfCell).countOfEntities(getEntity())
                        < maxCountInCell) {
            for (int i = 0; i<getCell().getAnimalsInCell().size(); i++){
                Animal couple = getCell().getAnimalsInCell().get(i);
                if (couple.getSex().equals(Sex.MALE)) {
                    child = born();
                    i = getCell().getAnimalsInCell().size()+1;
                    System.out.println("У " + getName() + " рождается " + child.getName());
                }

            }
        }
    }

    @Override
    public void die () {
        if (satiety <= 0) {
            Island.animals.remove(Animal.this);
            getCell().getAnimalsInCell().remove(Animal.this);
            System.out.println(getName() + " умер от голода.");
        }
    }

    public synchronized void move(){
        int speed = new Random().nextInt(maxSpeed) + 1 ;  // Задаем скорость
        int direction = new Random().nextInt(4);  // Задаем направление
        int x = getCell().getX();
        int y = getCell().getY();
        int indexOfCell = ((Island.x) * (y-1) + x) - 1; // Рассчитываем индекс текущей ячейки в списке
        switch (direction){
            case 0  -> // вправо
                    x = getCell().getX() + speed ;
            case 1  -> // влево
                    x = getCell().getX() - speed;
            case 2 -> // вниз
                    y = getCell().getY() + speed;
            case 3 -> // вверх
                    y = getCell().getY() - speed;
        }
        if (x<=1)
            x = 1;
        if (x > Island.x)
            x = Island.x;
        if (y<=1)
            y = 1;
        if (y > Island.y)
            y = Island.y;
        int newIndex = ((Island.x) * (y-1) + x) - 1;
        if (Island.cellList.get(newIndex).countOfEntities(getEntity())
                < maxCountInCell ){
            Island.cellList.get(indexOfCell).getAnimalsInCell().remove(Animal.this);
            setCell(Island.cellList.get(newIndex) );
            Island.cellList.get(newIndex).getAnimalsInCell().add(Animal.this);
            if (newIndex == indexOfCell )
                System.out.println(getName() + " не переместился. Конец острова.");
            else System.out.println(getName() + " переместился в ячейку " + getCell() );}
        else System.out.println(getName() + " не переместился. Нет свободного места."  );
        if (newIndex != indexOfCell )
            setSatiety(getSatiety() - (getSatiety()*0.1*speed));
        die();
    }


    public Sex getSex() {return sex;}

    public void setSex(Sex sex) {this.sex = sex;}

    public int getMaxSpeed() {return maxSpeed;}

    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

    public int getMaxCountInCell() {return maxCountInCell;}

    public void setMaxCountInCell(int maxCountInCell) {this.maxCountInCell = maxCountInCell;}

    public double getWeightForLife() {return weightForLife;}

    public void setWeightForLife(double weightForLife) {this.weightForLife = weightForLife;}

    public double getSatiety() {return satiety;}

    public void setSatiety(double satiety) {this.satiety = satiety;}

    @Override
    public String toString() {
        return getName() + "  "  + getCell()+
                " пол = " + sex + ", вес = " + getWeight() +
                ", сытость = " + satiety +
                '}';
    }

}
