package FacadePattern;

public class NotificationServer {
    public void connect(){

    }
    public void disconnect(){

    }

    public void send(AuthenticationToken token, Message message, String target){
        System.out.println(message.getMessage());
        System.out.println("Notification sent!!");
    }
}
