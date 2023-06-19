package Mediator;

import java.util.List;

public class ListBox extends UIControl{
    private List<TextBox> articles;
    private String selection;

    public ListBox(DialogBox owner) {
        super(owner);
    }

    public void addArticles(String article){
        var textBox = new TextBox(owner);
        textBox.setContent(article);
        articles.add(textBox);
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.change(this);
    }

    public String getSelection() {
        return selection;
    }
}
