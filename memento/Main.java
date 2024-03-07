public class Main{
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state 1");
        originator.setState("state 2");

        originator.setState("state 3");
        Memento memento1 = originator.saveStateToMemento();
        careTaker.add(memento1);

        originator.setState("state 4");
        Memento memento2 = originator.saveStateToMemento();
        careTaker.add(memento2);

        originator.setState("state 5");
        Memento memento3 = originator.saveStateToMemento();
        careTaker.add(memento3);

        System.out.println("current state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("first saved state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("second saved state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("third saved state: " + originator.getState());
    }
}