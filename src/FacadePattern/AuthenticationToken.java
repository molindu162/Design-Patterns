package FacadePattern;

public class AuthenticationToken {
    private String appID;
    private String key;

    public AuthenticationToken(String appID, String key) {
        this.appID = appID;
        this.key = key;
    }
}
