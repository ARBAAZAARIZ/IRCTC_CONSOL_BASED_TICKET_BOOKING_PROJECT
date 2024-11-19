package main.model;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {     // getting username
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {   // getting password
        return password;
    }

    @Override
    public String toString(){
        System.out.println();
        return "username : "+ username +"\n"+"password : "+password;
    }
}

