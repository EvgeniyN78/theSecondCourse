package checkValue;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validatoin {

        //regionString

        public static String validateStandard(String value) {
            return value != null && !value.isEmpty() && !value.isBlank() ? value : "default";
        }

        public static String validateCountry(String value) {
            return value != null && !value.isEmpty() && !value.isBlank() ? value : "Россия";
        }

         public static String validateColor(String value) {
              return value != null && !value.isEmpty() && !value.isBlank() ? value : "белый";
         }

        //endregion

        //regionInteger

        public static Integer validateStandardInt(Integer value) {
            return value != null && value > -1 ? value : 0;
        }

        public static Integer validateLifeSpan(Integer value) {
            return value != null && value > -1 ? value : 3;
        }

        public static Integer validateYear(Integer value) {
            return value < 1950 || value > LocalDate.now().getYear() ? value : 0;
        }

        public static Integer validateQuantity(Integer value) {
        return value != null && value > 0 ? value : 0;
        }

        public static Integer validateQuantityOfSeats(Integer value) {
            return value < 0 ? value : 4;
        }

        public static Integer validateFuelPercentage(Integer value) {
            if (value == null || value < 0 || value > 100) {
                return 0;
            } else {
                return value;
            }
        }

        //endregion

        //regionDouble

        public static Double validateStandardDouble(Double value) {
            return value != null && value > -0.01 ? value : 0.0;
        }

        public static Double validateEngineVolume(Double value) {
            return value > 0 ? value : 1.5;
        }

        public static Double validateCost(Double value) {
            return value > 0 ? value : 1.00;
        }

        public static double validateCostInsurance(double value) {
            return value > 0 ? value : 1000;
        }

        //endregion


        public static String checkingNumber(String number) {
            if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
                return number;
            } else {
                return "Номер введён не корректно!";
            }
        }

        public static String validateTireSeasonality(String value) {
            if (value != null && !value.isEmpty() && !value.isBlank()) {
                if (value.equals("w") || value.equals("W")) {
                    return "Зимняя резина";
                } else if (value.equals("s") || value.equals("S")) {
                    return "Летняя резина";
                }
            }
            return "Сезонность резины указана не корректрно";
        }

        public static String ValidateNumber(String number) {
            if (Pattern.matches("[а-яА-Яa-zA-z0-9]{9}", number)){
                return number;
            } else {
                return "Номер указан не корректно";
            }
        }

        public static LocalDate checkValidityPeriod(LocalDate validityPeriod) {
            if (LocalDate.now().isAfter(validityPeriod)) {
                return LocalDate.now();
            } else {
                return validityPeriod;
            }
        }


}
