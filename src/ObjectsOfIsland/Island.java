package src.ObjectsOfIsland;

import src.ObjectsOfIsland.Animal.Animal;
import src.ObjectsOfIsland.Plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Island {

    public static int x; //длинна острова
    public static int y; //ширина острова
    public static List<Cell> cellList = new ArrayList<>();
    public static List <Animal> animals = new ArrayList<>();
    public static List <Plant> plants = new ArrayList<>();

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
        for (int i = 1; i<= y; i++){
            for (int j = 1; j<= x; j++){
                Cell cell = new Cell(j, i);
                cellList.add(cell);
            }
        }
    }

    @Override
    public String toString() {
        return "Остров{" +
                "длинна(x) = " + x +
                ", ширина(y) = " + y +
                ", список клеток = " + cellList +
                '}';
    }
}
