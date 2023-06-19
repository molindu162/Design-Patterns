package Mediator;

import java.util.List;

public class ArticleDialogBox extends DialogBox{
    private ListBox articleListBox = new ListBox(this);
    private Button button = new Button(this);
    private TextBox titleTextBox = new TextBox(this);

    public void simulate(){
        articleListBox.setSelection("Article 1");
        System.out.println("Text Box: " + titleTextBox.getContent());
        System.out.println("Button: " + button.isEnabled());
    }

    @Override
    public void change(UIControl control) {
        if (control == articleListBox)
            articleSelected();

        if (control == titleTextBox)
            titleChanged();
    }

    private void titleChanged(){
        String content = titleTextBox.getContent();
        boolean isEmpty =  (content == null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }

    private void articleSelected(){
        titleTextBox.setContent(articleListBox.getSelection());
        button.setEnabled(true);
    }
}
