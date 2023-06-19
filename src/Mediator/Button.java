package Mediator;

public class Button extends UIControl{
    private boolean isEnabled = false;
    public Button(DialogBox owner) {
        super(owner);
    }

    public void setEnabled(boolean condition){
        isEnabled = condition;
        owner.change(this);
    }

    public boolean isEnabled(){
        return this.isEnabled;
    }
}
