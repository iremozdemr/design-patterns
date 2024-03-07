public interface Flys{
    public String fly();
}

class CanFly implements Flys{
    public String fly(){
        return "flying high";
    }
}

class CantFly implements Flys{
    public String fly(){
        return "i can't fly";
    }
}