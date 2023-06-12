package ChainOfResponsibility;

public class HttpRequest {
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return email;
    }

    private String userName;
    private String email;

    public HttpRequest(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}
