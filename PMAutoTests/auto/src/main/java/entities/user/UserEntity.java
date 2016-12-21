package entities.user;

/**
 * @author: matcievskiy on 29.02.2016.
 */
public class UserEntity {

    private String login;

    private String password;

    private String key;

    public UserEntity(String login,String password,String key){

        this.login = login;
        this.password = password;
        this.key = key;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return key;
    }

    public void setRole(String role) {
        this.key = key;
    }
}
