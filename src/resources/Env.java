package resources;

public class Env {

    private static Env instance;
    private String url = "";
    private String user = "";
    private String password = "";

    private Env() {}

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public static Env getInstance() {
        if (instance == null) {
            instance = new Env();
        }
        return instance;
    }
}
