import Composite.Group;
import Composite.Shape;
import FacadePattern.NotificationService;

public class Main {
    public static void main (String[] args){
        NotificationService service = new NotificationService();
        service.send();
    }
}
