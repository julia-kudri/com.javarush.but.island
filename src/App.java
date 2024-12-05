package src;

import src.Simulation.*;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Settings settings = new Settings();
        MoveAnimal moveAnimal = new MoveAnimal(settings);   // животные перемещаются
        moveAnimal.start();
        PredatorEat predatorEat = new PredatorEat(settings);  // хищники едят
        predatorEat.start();
        HerbivoreEat herbivoreEat = new HerbivoreEat(settings); // травоядные едят
        herbivoreEat.start();
        GrowPlant growPlant = new GrowPlant(settings);    // трава растет
        growPlant.start();
        Reproduce reproduce = new Reproduce(settings);   // животные размножаются
        reproduce.start();

        moveAnimal.join();
        predatorEat.join();
        herbivoreEat.join();
        growPlant.join();
        reproduce.join();

        settings.getCurrentState();            // текущий статус

    }
}
