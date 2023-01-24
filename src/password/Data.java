package password;

import java.util.regex.Pattern;

public class Data {

    public static void checkDate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (!success(login)) {
            throw new WrongLoginException("Логин указан не верно.");
        }
        if (success(password) && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указаны корректно.");
        } else {
            throw new WrongPasswordException("Пароль указан не верно.");
        }
    }

    public static boolean success(String success) {
        if (success == null || success.isEmpty() || success.isBlank() || success.length() > 20) {
            return false;
        }
        return Pattern.matches("[a-zA-Z0-9_]*$", success);
    }

    public static boolean validate(String login, String password, String confirmPassword) {

        try {
            checkDate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}