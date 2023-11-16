package resources;

public class Env {

    private static Env instance;
    private String url = "jdbc:oracle:thin:@orclgrad1.icmc.usp.br:1521/pdb_elaine.icmc.usp.br";
    private String user = "a11816164";
    private String password = "a11816164";

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
