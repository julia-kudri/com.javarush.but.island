package src.Simulation;

public class Reproduce extends Thread {
    Settings settings;

    public Reproduce(Settings settings) {this.settings = settings;}

    @Override
    public void run() {
        for (int i = 0; i < Settings.COUNT_OF_STEPS; i++) {
            settings.animalsBreed ();
            try {
                Thread.sleep(settings.GAP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}