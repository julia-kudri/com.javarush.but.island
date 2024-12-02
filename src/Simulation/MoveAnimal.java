package src.Simulation;

public class MoveAnimal extends Thread {
    Settings settings;

    public MoveAnimal(Settings settings) {this.settings = settings;}

    @Override
    public void run() {
        for (int i = 0; i < Settings.COUNT_OF_STEPS; i++) {
            settings.animalsMove();
            try {
                Thread.sleep(settings.GAP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}