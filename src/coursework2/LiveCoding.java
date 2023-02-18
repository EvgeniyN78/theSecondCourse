package coursework2;

import validation.TooLongStringException;

public class LiveCoding {
    public static void main(String[] args) {
/* Билет № 15
1-е задание:
    Напишите метод, который возводит число в куб.                                                            */

//        System.out.println((int)pow(3));

/*2-е задание:
    Напишите пример перехвата и обработки исключения в секции throws-метода и передачи вызывающему методу.    */

        String text = "012345678901234567";

        try {
            checkString(text);
        } catch (TooLongStringException e) {
            System.out.println("Строка " + '\"' + text + '\"' + " слишком длинная.");
            text = text.substring(0, 10);
            System.out.println("Обрезанная строка будет состоять из 10 символов, и иметь следующий вид:" + "\n"
                    + '"' + text + '"');
        }
    }

    public static double pow(double value) {
        return Math.pow(value, 3);
    }

    public static void checkString(String text) throws TooLongStringException {
        if (text.length() > 10) {
            throw new TooLongStringException();
        } else {
            System.out.println(text);
        }
    }
}
