import java.util.Random;

public class Enemy {
    int level;
    int healthPoints;
    int armor;
    int strenght;
    String type;

    Random rand = new Random();

    public Enemy(int level, int healthPoints, int armor, int strenght, String name) {
        this.level = level;
        this.healthPoints = healthPoints;
        this.armor = armor;
        this.strenght = strenght;
        this.type = type;
    }

    void randomizeStats(int level) {
        this.level = rand.nextInt(level, level+3);
        this.healthPoints = this.level + rand.nextInt(5,10);
        this.armor = this.level + rand.nextInt(0,1);
        this.strenght = this.level-1;
        switch (rand.nextInt(1,4)) {
            case 1:
                this.type = "-Orc-";
                break;
            case 2:
                this.type = "-Elf-";
                break;
            case 3:
                this.type = "Dwarf";
                break;
            default:
                break;
        }
    }

    void showStats() {
        System.out.println("------------" + this.type + "-----------");
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.healthPoints);
        System.out.println("Armor: " + this.armor);
        System.out.println("Strenght: " + this.strenght);
        System.out.println("----------------------------");
    }

    public Item dropItem() {
        double randomValue = Math.random();
        for (Item item : Item.values()) {
            if (randomValue < item.getDropChance()) {
                return item;
            }
        }
        return null;
    }
}
