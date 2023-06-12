package Momento;

import java.util.List;
import java.util.Stack;

public class Editor {

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }
}
