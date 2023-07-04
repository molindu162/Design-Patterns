package FacadePattern;

public class NotificationService {
    public void send(){
        NotificationServer notificationServer = new NotificationServer();
        notificationServer.connect();
        AuthenticationToken authToken = new AuthenticationToken("ABC123", "123");
        notificationServer.send(authToken, new Message("ABCD"), "Android");
    }
}
