package validation;

public class Validation {

    public static String checkString(String str) {
        if (str == null || str.isEmpty() || str.isBlank()) {
            throw new WrongInputException("Некорректный ввод.");
        } else {
            return str;
        }
    }

    public static String validateStandardStr(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "default";
    }

    public static String validateStandardStr(String value, String substitution) {
        return (value == null || value.isEmpty() || value.isBlank()) ? substitution : value;
    }

    public static Integer validateStandardInteger(Integer value, Integer substitution) {
        return (value == null || value <= 0) ? substitution : value;
    }

    public static Boolean validatePassedDiagnostics(Boolean value) {
        if (value = Boolean.valueOf("yes")) {
            return true;
        } else {
            return false;
        }
    }


}
