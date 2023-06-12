package AbstractFactory.app;

import AbstractFactory.Theme;
import AbstractFactory.WidgetFactory;
import AbstractFactory.ant.AntButton;
import AbstractFactory.ant.AntTextBox;
import AbstractFactory.material.MaterialButton;
import AbstractFactory.material.MaterialTextBox;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
