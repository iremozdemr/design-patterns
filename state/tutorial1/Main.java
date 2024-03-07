public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState state1 = new StartState();
        state1.doAction(context);

        System.out.println(context.getState().toString());

        StopState state2 = new StopState();
        state2.doAction(context);

        System.out.println(context.getState().toString());
    }
}