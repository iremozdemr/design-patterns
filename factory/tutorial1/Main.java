import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip enemyShip = null;

        System.out.println("type of ship? (u/r)");
        Scanner scanner = new Scanner(System.in);

        String shipType = scanner.nextLine();
        enemyShip = factory.makeEnemyShip(shipType);
        attackEnemy(enemyShip);
    }

    public static void attackEnemy(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHero();
        enemyShip.attack();
    }
}