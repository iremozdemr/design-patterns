public class Animal{

    public Flys flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public Flys getFlyingType() {
        return this.flyingType;
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }
}