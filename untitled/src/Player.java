public class Player {
    static String name;
    static Levels level = Levels.LEVEL_1;
    static double amountOfExpierience = 0;

    public Player(String name) {
        this.name = name;
    }

    public void canLevelUp() {
        if (amountOfExpierience >= level.xpToLevelUp) {
            level = level.nextLevel();
        } else {

        }
    }

    static void showStats(Levels level, double exp) {
        System.out.println("---------"+ name +"----------");
        System.out.println("Level: " + level.level);
        System.out.println("HP: " + level.healthPoints);
        System.out.println("Mana: " + level.mana);
        System.out.println("Armor: " + level.armor);
        System.out.println("Strenght: " + level.strenght);
        System.out.println("Experience: " + exp + " xp");
        System.out.println("-----------------------------");
    }
}
