public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("content 1");
        EditorState state1 = editor.createState();
        history.push(state1);

        editor.setContent("content 2");
        EditorState state2 = editor.createState();

        editor.setContent("content 3");
        EditorState state3 = editor.createState();
        history.push(state3);

        System.out.println(editor.getContent());
    }
}