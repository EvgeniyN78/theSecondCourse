package Password;

import java.util.regex.Pattern;

public class Data {
//regionВариант1
//    private static final String VALID_CHARACTERS = "ABCDEFHGIJKLMNOPQRSTUVWXYZabcdefhgijklmnopqrstuvwxyz0123456789_";
//
//    private Data() {
//    }
//
//    public static boolean validate(String login, String password, String confirmPassword) {
//
//        try {
//            check(login, password, confirmPassword);
//        } catch (WrongLoginException | WrongPasswordException e) {
//            System.out.println(e.getMessage());
//            return false;
//        }
//        return true;
//
//    }
//
//    public static void check(String login, String password, String confirmPassword)
//            throws WrongLoginException, WrongPasswordException {
//        if (!validate(login)) {
//            throw new WrongLoginException("Логин не валидный!");
//        }
//        if (!validate(password)) {
//            throw new WrongPasswordException("Пароль не валидный!");
//        }
//        if (!password.equals(confirmPassword)) {
//            throw new WrongPasswordException("Пароли должны совпадать!");
//        }
//
//    }
//
//    private static boolean validate(String s) {
//        if (s.length() > 20) {
//            return false;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
//                return false;
//            }
//        }
//        return true;
//    }
//endregion

    public static void checkDate(String login, String password, String confirmPassword) throws WrongLoginException,
    WrongPasswordException {

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