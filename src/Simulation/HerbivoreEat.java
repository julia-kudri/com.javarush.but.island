package src.Simulation;

public class HerbivoreEat extends Thread {
    Settings settings;

    public HerbivoreEat(Settings settings) {this.settings = settings;}

    @Override
    public void run() {
        for (int i = 0; i < Settings.COUNT_OF_STEPS; i++) {
            settings.animalsEatPlant();
            try {
                Thread.sleep(settings.GAP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
