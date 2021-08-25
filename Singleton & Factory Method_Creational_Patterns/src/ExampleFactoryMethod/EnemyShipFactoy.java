package ExampleFactoryMethod;

public class EnemyShipFactoy extends EnemyShip {

    public EnemyShip createEnemy(String enemyType){
        EnemyShip enemy = null;

        if(enemyType.equals("U")){
            enemy = new UFOEnemyShip();
        }else if(enemyType.equals("R")){
            enemy= new RocketEnemyShip();
        }else if(enemyType.equals("B")){
            enemy = new BigUFOEnemyShip();
        }
        return enemy;
    }

}
