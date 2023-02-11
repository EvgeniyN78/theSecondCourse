package validation;

public class TooLongStringException extends Exception {
    public TooLongStringException() {
    }

    public TooLongStringException(String message) {
        super(message);
    }

    public TooLongStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooLongStringException(Throwable cause) {
        super(cause);
    }

}
