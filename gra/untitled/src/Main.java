import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        Enemy enemy1 = new Enemy(0,0,0,0,null);
        Enemy enemy2 = new Enemy(0,0,0,0,null);
        Enemy enemy3 = new Enemy(0,0,0,0,null);

        String answerString;
        int answerInt;

        int amounOfDoors;
        int numberOfEnemies;

        System.out.println("Welcome to the game, whenever you want to exit type exit.");
        System.out.println("Type your name to start");

        answerString = sc.nextLine();
        Player player = new Player(answerString);

        while (!answerString.equals("exit")) {
            System.out.println("Current level: " + Player.level.level);
            System.out.println("Do you want to check your statistics?(y,n)");
            while (true) {
                answerString = sc.next();
                if (answerString.equals("y")) {
                    Player.showStats(Player.level);
                    break;
                } else if (answerString.equals("n")) {
                    break;
                } else {

                }
            }
            amounOfDoors = rand.nextInt(2,4);
            System.out.println("You have " + amounOfDoors + " doors in front of you. Where do you wanna go?");
            for (int i = 1; i <= amounOfDoors; i++) {
                System.out.println(i + ".Door number " + i);
            }
            while (true) {
                if (sc.hasNextInt()) {
                    answerInt = sc.nextInt();
                    if (answerInt <= amounOfDoors && answerInt >= 1) {
                        System.out.println("You chose door number " + answerInt);
                        break;
                    }
                }
            }

            numberOfEnemies = rand.nextInt(1,4);
            System.out.println("You encounter " + numberOfEnemies + " enemies here are them:");
            switch (numberOfEnemies) {
                case 1:
                    enemy1.randomizeStats(Player.level.level);
                    enemy1.showStats();
                    break;
                case 2:
                    enemy1.randomizeStats(Player.level.level);
                    enemy1.showStats();
                    enemy2.randomizeStats(Player.level.level);
                    enemy2.showStats();
                    break;
                case 3:
                    enemy1.randomizeStats(Player.level.level);
                    enemy1.showStats();
                    enemy2.randomizeStats(Player.level.level);
                    enemy2.showStats();
                    enemy3.randomizeStats(Player.level.level);
                    enemy3.showStats();
                    break;
            }
            System.out.println();
            System.out.println("Your actions: ");
            System.out.println("1.Attack");
            System.out.println("2.Try to hide");
            System.out.println("3.Run away");

            whilee:
            while (true) {
                answerInt = sc.nextInt();
                if (answerInt >= 1 && answerInt <= 3) {
                    switch (answerInt) {
                        case 1:
                            System.out.println("You chose to attack.");
                            break whilee;
                        case 2:
                            System.out.println("You chose to try to hide.");
                            break whilee;
                        case 3:
                            System.out.println("You chose to run away.");
                            break whilee;
                    }
                }
            }

        }
    }
}