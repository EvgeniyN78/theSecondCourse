package validation;

public class WrongInputException extends RuntimeException{
    public WrongInputException(String s) {
        super(s);
    }
}
