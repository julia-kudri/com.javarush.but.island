package Objects.Animals;

public abstract class Animal {
    double weight;
    final double maxSatiety;     //(Макс насыщение)
    double actualSatiety;     //(Фактическая сытость)


    public Animal(){}


    public void eat(Plant plant){}
    public void eat(Animal animal){}
    public void worker(){}
    public void move(){}
    public void chooseDirection(){}//(Выбрать направление)
    public void reproduce(){}
    public void die(){}
}
