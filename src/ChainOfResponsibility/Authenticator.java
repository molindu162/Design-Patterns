package ChainOfResponsibility;

public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        return !(request.getUserName().equals("admin") && request.getPassword().equals("1234"));
    }
}
