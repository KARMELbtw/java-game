public class Player {
    static String name;
    static Levels level = Levels.LEVEL_1;
    double amountOfExpierience = 0;
    Item[] inventory = new Item[30];

    public Player(String name) {
        this.name = name;
    }

    static void showStats(Levels level) {
        System.out.println("---------"+ name +"----------");
        System.out.println("Level: " + level.level);
        System.out.println("HP: " + level.healthPoints);
        System.out.println("Mana: " + level.mana);
        System.out.println("Armor: " + level.armor);
        System.out.println("Strenght: " + level.strenght);
        System.out.println("-----------------------------");
    }
}
