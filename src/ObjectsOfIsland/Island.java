package ObjectsOfIsland;

import ObjectsOfIsland.Animal.Animal;
import ObjectsOfIsland.Plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Island {

    public static int xLenght; //длинна острова
    public static int yLenght; //ширина острова
    public static List<Cell> cellList = new ArrayList<>();
    public static List <Animal> animals = new ArrayList<>();
    public static List <Plant> plants = new ArrayList<>();

    public Island(int xLenght, int yLenght) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        for (int i = 1; i<=yLenght; i++){
            for (int j = 1; j<=xLenght; j++){
                Cell cell = new Cell(j, i);
                cellList.add(cell);
            }
        }
    }

    @Override
    public String toString() {
        return "Остров{" +
                "длинна(x) = " + xLenght +
                ", ширина(y) = " + yLenght +
                ", список клеток = " + cellList +
                '}';
    }
}
