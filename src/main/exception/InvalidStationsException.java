package main.exception;

public class InvalidStationsException extends RuntimeException {
    public InvalidStationsException(String message) {
        super(message);
    }
}
