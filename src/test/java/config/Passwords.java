package config;

public enum Passwords {

    DANNYPASS("Password1!"),
    DCUPASS("Password1"),
    TESTERPASS(""),
    EAMONPASS("Password1!");

    private final String password;

    Passwords(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
