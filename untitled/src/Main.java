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

        int amountOfDoors;
        int numberOfEnemies;
        int enemiesLeft;
        int whichEnemy;
        int damage;
        int expGainded;

        boolean fight = false;

        System.out.println("Welcome to the game, whenever you want to exit type exit.");
        System.out.println("Type your name to start");

        answerString = sc.nextLine();
        Player player = new Player(answerString);
        System.out.println("Specify on what level do you want to start (1-1000)");

        while (true) {
            try {
                answerInt = Integer.parseInt(sc.next());
                if (answerInt >= 1 && answerInt <= 1000) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 1000.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again");
            }
        }

        player.level = Player.level.setLevel(answerInt-1);
        player.amountOfExpierience = player.level.getLevelxp(player.level.level);


        game:
        while (true) {
            System.out.println("Current level: " + Player.level.level);
            System.out.println("Do you want to check your statistics?(y,n)");
            while (true) {
                answerString = sc.next();
                if (answerString.equals("y")) {
                    Player.showStats(Player.level, Player.amountOfExpierience);
                    System.out.println("Type c to continue");
                    next:
                    while (true) {
                        answerString = sc.next();
                        if (answerString.equals("c")) {
                            break next;
                        } else if (answerString.equals("exit")) {
                            break game;
                        }
                    }
                    break;
                } else if (answerString.equals("n")) {
                    break;
                } else if (answerString.equals("exit")) {
                    break game;
                }
            }
            amountOfDoors = rand.nextInt(2,4);
            System.out.println("You have " + amountOfDoors + " doors in front of you. Where do you wanna go?");
            for (int i = 1; i <= amountOfDoors; i++) {
                System.out.println(i + ".Door number " + i);
            }
            while (true) {
                answerString = sc.next();
                if (answerString.equals("1") || answerString.equals("2") || answerString.equals("3")) {
                    answerInt = Integer.parseInt(answerString);
                    if (answerInt <= amountOfDoors && answerInt >= 1) {
                        System.out.println("You chose door number " + answerInt);
                        break;
                    }
                } else if (answerString.equals("exit")) {
                    break game;
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
            System.out.println("2.Run away");

            whilee:
            while (true) {
                answerString = sc.next();
                if (answerString.equals("1") || answerString.equals("2")) {
                    switch (answerString) {
                        case "1":
                            System.out.println("You chose to attack.");
                            fight = true;
                            break whilee;
                        case "2":
                            System.out.println("You chose to run away.");
                            break whilee;
                    }
                } else if (answerString.equals("exit")) {
                    break game;
                }
            }
            System.out.println();
            enemiesLeft = numberOfEnemies;
            fight:
            while (fight) {
                if (enemiesLeft <= 0) {
                    break fight;
                }
                damage = rand.nextInt(player.level.strenght,player.level.strenght+1) - (enemy1.armor/2) + 2;
                System.out.println("You attack enemy number " + enemiesLeft + " and deal " + damage + " damage");
                switch (enemiesLeft) {
                    case 1:
                        enemy1.healthPoints -= damage;
                        if (enemy1.healthPoints <= 0) {
                            expGainded = enemy1.level+rand.nextInt(1,10);
                            player.amountOfExpierience += expGainded;
                            System.out.println("You kill " + enemy1.type + " and gain " + expGainded + " exp");
                            enemiesLeft -= 1;
                        }
                        break;
                    case 2:
                        enemy2.healthPoints -= damage;
                        if (enemy2.healthPoints <= 0) {
                            expGainded = enemy2.level*10+rand.nextInt(5,35);
                            player.amountOfExpierience += expGainded;
                            System.out.println("You kill " + enemy2.type + " and gain " + expGainded + " exp");
                            enemiesLeft -= 1;
                        }
                        break;
                    case 3:
                        enemy3.healthPoints -= damage;
                        if (enemy3.healthPoints <= 0) {
                            expGainded = enemy3.level*10+rand.nextInt(1,10);
                            player.amountOfExpierience += expGainded;
                            System.out.println("You kill " + enemy3.type + " and gain " + expGainded + " exp");
                            enemiesLeft -= 1;
                        }
                        break;
                }
                switch (enemiesLeft) {
                    case 1:
                        enemy1.showStats();
                        break;
                    case 2:
                        enemy1.showStats();
                        enemy2.showStats();
                        break;
                    case 3:
                        enemy1.showStats();
                        enemy2.showStats();
                        enemy3.showStats();
                        break;
                }
                if (enemiesLeft > 0) {
                    whichEnemy = rand.nextInt(1,enemiesLeft+1);
                    switch (whichEnemy) {
                        case 1:
                            damage = rand.nextInt(enemy1.strenght,enemy1.strenght+1)/4-player.level.armor/2+1;
                            damage = damage+enemy1.strenght/2;
                            System.out.println(enemy1.type + " attacks you for " + damage + " hp");
                            player.level.healthPoints -= damage;
                            System.out.println("You have " + player.level.healthPoints + " hp left");
                            break;
                        case 2:
                            damage = rand.nextInt(enemy2.strenght,enemy2.strenght+1)/4-player.level.armor/2+1;
                            damage = damage+enemy1.strenght/2;
                            System.out.println(enemy2.type + " attacks you for " + damage + " hp");
                            player.level.healthPoints -= damage;
                            System.out.println("You have " + player.level.healthPoints + " hp left");
                            break;
                        case 3:
                            damage = rand.nextInt(enemy3.strenght,enemy3.strenght+1)/4-player.level.armor/2+1;
                            damage = damage+enemy1.strenght/2;
                            System.out.println(enemy3.type + " attacks you for " + damage + " hp");
                            player.level.healthPoints -= damage;
                            System.out.println("You have " + player.level.healthPoints + " hp left");
                            break;
                    }
                    if (player.level.healthPoints < 1) {
                        System.out.println("You died");
                        break game;
                    }
                    if (player.level.healthPoints < Levels.values()[player.level.ordinal()+1].healthPoints) {
                        if (player.level.healthPoints+ player.level.level/10+3 > player.level.level) {
                            System.out.println("You regenerate " + (Levels.values()[player.level.ordinal() + 1].healthPoints - player.level.healthPoints) + " hp and now have " + Levels.values()[player.level.ordinal()+1].healthPoints  + " hp" );
                            player.level.healthPoints = Levels.values()[player.level.ordinal()+1].healthPoints;
                        }
                        else {
                            System.out.println("You regenerate " + (player.level.level/2+2) + " hp and now have " + (player.level.healthPoints+player.level.level/2+2) + " hp" );
                            player.level.healthPoints += player.level.level/2+2;
                        }

                    }
                }

                System.out.println("Type c to continue or r to run away");
                next:
                while (true) {
                    answerString = sc.next();
                    if (answerString.equals("c")) {
                        break next;
                    }
                    else if (answerString.equals("r")) {
                        break fight;
                    } else if (answerString.equals("exit")) {
                        break game;
                    }
                }
            }
            player.canLevelUp();
        }
    }
}