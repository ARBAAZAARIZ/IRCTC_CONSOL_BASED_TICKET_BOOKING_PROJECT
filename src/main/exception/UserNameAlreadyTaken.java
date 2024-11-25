package main.exception;

public class UserNameAlreadyTaken extends RuntimeException {
    public UserNameAlreadyTaken(String message) {
        super(message);
    }
}
