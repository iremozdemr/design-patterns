import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> list = new ArrayList<>();

    public void add(Memento state){
        list.add(state);
    }

    public Memento get(int index){
        return list.get(index);
    }
}