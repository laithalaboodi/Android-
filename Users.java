public class Users {
    private String username;
    private String email;
    private String password;

    public Users(){

    }

    public Users(String username,String email, String password) {
        this.username=username;
          this.email = email;
          this.password=password;

    }


    // Getter methods
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    // Setter methods
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
