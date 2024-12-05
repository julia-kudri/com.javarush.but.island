package src.ObjectsOfIsland;


public enum Entity {

    //PREDATORS
    WOLF ("Волк",
            50,
            3,
            30,
            8,
            8),
    BOA ("Удав",
            15,
            1,
            30,
            3,
            3),
    FOX ("Лиса",
            8,
            2,
            30,
            2,
            2),
    EAGLE ("Орел",
            6,
            3,
            20,
            1,
            1),
    BEAR ("Медведь",
            500,
            2,
            5,
            80,
            80),

    //HERBIVORES
    RABBIT ("Кролик",
            2,
            2,
            150,
            0.45 ,
            0.45 ),
    HORSE ("Лошадь",
            400,
            4,
            20,
            60,
            60),
    DEER ("Олень",
            300,
            4,
            20,
            50,
            50),
    MOUSE ("Мышь",
            0.05,
            1,
            500,
            0.01,
            0.01),
    GOAT ("Коза",
            60,
            3,
            140,
            10,
            10),
    SHEEP ("Овца",
            70,
            3,
            140,
            15,
            15),
    BOAR ("Кабан",
            400,
            2,
            50,
            50,
            50),
    BUFFALO ("Буйвол",
            700,
            3,
            10,
            100,
            100),
    DUCK ("Утка",
            1,
            4,
            200,
            0.15,
            0.15),
    CATERPILLAR ("Гусеница",
            0.01,
            0,
            1000,
            0,
            0),

    //PLANTS
    PLANT ("Растение",
            1,
            0,
            200,
            0 ,
            0);

    private final String name;
    private final double weight;
    private final int maxSpeed;
    private final int maxCountInCell;
    private final double weightForLife;
    private double satiety;

    Entity(String name, double weight, int maxSpeed, int maxCountInCell, double weightForLife, double satiety) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.maxCountInCell = maxCountInCell;
        this.weightForLife = weightForLife;
        this.satiety = satiety;
    }

    public String getName() {return name;}

    public double getWeight() {return weight;}

    public int getMaxSpeed() {return maxSpeed;}

    public int getMaxCountInCell() {return maxCountInCell;}

    public double getWeightForLife() {return weightForLife;}

    public double getSatiety() {return satiety;}

    public void setSatiety(double satiety) {this.satiety = satiety;}

}
