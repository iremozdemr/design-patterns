public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        if(newShipType.equals("u")){
            return new UFOEnemyShip();
        }
        else if(newShipType.equals("r")){
            return new RocketEnemyShip();
        }
        else{
            return null;
        }
    }
}