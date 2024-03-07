package memento.tutorial2;

public class Editor {
    private String content;

    public Editor(){
    }

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState editorState){
        content = editorState.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}