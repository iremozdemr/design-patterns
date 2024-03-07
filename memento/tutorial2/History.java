package memento.tutorial2;

import java.util.ArrayList;

public class History {
    private ArrayList<EditorState> editorStates = new ArrayList<>();

    public History(){
    }

    public void push(EditorState editorState){
        editorStates.add(editorState);
    }

    public EditorState pop(){
        int lastIndex = editorStates.size()-1;
        EditorState lastSEditorState = editorStates.get(lastIndex);
        editorStates.remove(lastIndex);
        return lastSEditorState;
    }
}