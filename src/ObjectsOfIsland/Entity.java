package src.ObjectsOfIsland;


public enum Entity {

    //PREDATORS
    WOLF ("Волк",
            "\uD83D\uDC3A",
            50,
            3,
            30,
            8,
            4),
    BOA ("Удав",
            "\uD83D\uDC0D",
            15, 1,
            30,3,
            1.5),
    FOX ("Лиса",
            "\uD83E\uDD8A",
            8, 2,
            30,
            2,
            1),
    EAGLE ("Орел",
            "\uD83E\uDD85",
            6, 3,
            20,
            1,
            0.5),
    BEAR ("Медведь",
            "\uD83D\uDC3B",
            500,
            2,
            5,
            80,
            40),
    //HERBIVORES
    RABBIT ("Кролик",
            "\uD83D\uDC07",
            2, 2,
            150,
            0.45 ,
            0.225 ),
    HORSE ("Лошадь",
            "\uD83D\uDC0E",
            400,
            4,
            20,
            60,
            30),
    DEER ("Олень",
            "\uD83E\uDD8C",
            300, 4,
            20,
            50,
            25),
    MOUSE ("Мышь",
            "\uD83D\uDC01",
            0.05,
            1,
            500,
            0.01,
            0.005),
    GOAT ("Коза",
            "\uD83D\uDC10",
            60,
            3,
            140,
            10,
            5),
    SHEEP ("Овца",
            "\uD83D\uDC11",
            70,
            3,
            140,
            15,
            7.50),
    BOAR ("Кабан",
            "\uD83D\uDC17",
            400,
            2,
            50,
            50,
            25),
    BUFFALO ("Буйвол",
            "\uD83D\uDC03",
            700,
            3,
            10,
            100,
            50),
    DUCK ("Утка",
            "\uD83E\uDD86",
            1,
            4,
            200,
            0.15,
            0.075),
    CATERPILLAR ("Гусеница",
            "\uD83D\uDC1B",
            0.01,
            0,
            1000,
            0,
            0),
    //PLANTS
    PLANT ("Растение",
            "\uD83C\uDF31",
            1,
            0,
            200,
            0 ,
            0);

    private final String name;
    private final String symbol;
    private final double weight;
    private final int maxSpeed;
    private final int maxCountInCell;
    private final double weightForLife;
    private double satiety;

    Entity(String name, String symbol, double weight, int maxSpeed, int maxCountInCell, double weightForLife, double satiety) {
        this.name = name;
        this.symbol = symbol;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.maxCountInCell = maxCountInCell;
        this.weightForLife = weightForLife;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }
    public String getSymbol() {
        return symbol;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxCountInCell() {
        return maxCountInCell;
    }

    public double getWeightForLife() {
        return weightForLife;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

}
