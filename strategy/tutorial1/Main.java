public class Main{
    public static void main(String[] args) {
        
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("dog: "+sparky.tryToFly());
        System.out.println("bird: "+tweety.tryToFly());

        tweety.setFlyingType(new CantFly());
        System.out.println("bird: "+tweety.tryToFly());
    }
}