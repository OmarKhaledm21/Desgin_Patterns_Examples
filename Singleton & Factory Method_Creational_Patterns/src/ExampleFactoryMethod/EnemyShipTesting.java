package ExampleFactoryMethod;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args){
        EnemyShipFactoy shipFactory = new EnemyShipFactoy();
        EnemyShip enemy = null;

        Scanner input = new Scanner(System.in);
        System.out.println("What type ship? (R/U/B)");

        if(input.hasNextLine()){
            String type = input.next();
            enemy = shipFactory.createEnemy(type);
        }

        if(enemy!= null) {
            doStuffEnemy(enemy);
        }else{
            System.out.println("No type was spec..");
        }

    }

    public static void doStuffEnemy(EnemyShip obj){
        obj.displayEnemyShip();
        obj.followHeroShip();
        obj.enemyShipShoots();
    }
}
