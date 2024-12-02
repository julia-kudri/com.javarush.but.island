package src.Simulation;

import src.ObjectsOfIsland.Island;
import src.ObjectsOfIsland.Plant.Plant;

public class GrowPlant extends Thread {
    Settings settings;

    public GrowPlant(Settings settings) {this.settings = settings;}

    @Override
    public void run() {
        for (int i = 0; i < Settings.COUNT_OF_STEPS; i++) {
            for (int j = 0; j < Settings.COUNT_OF_PLANT; j++) {
                if (Island.plants.size() < Settings.COUNT_OF_PLANT)
                    new Plant();
                try {
                    Thread.sleep(settings.GAP);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
