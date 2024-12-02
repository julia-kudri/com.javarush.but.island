package src.Simulation;

public class PredatorEat extends Thread {
    Settings settings;

    public PredatorEat(Settings settings) {this.settings = settings;}

    @Override
    public void run() {
        for (int i = 0; i < Settings.COUNT_OF_STEPS; i++) {
            settings.animalsEatAnimal();
            try {
                Thread.sleep(settings.GAP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
