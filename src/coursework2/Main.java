package coursework2;

import coursework2.tasks.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static Calendar calendar;

    public static void main(String[] args) {
        calendar = new Calendar();
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner); //создать задачу
                            break;
                        case 2:
                            deleteTask(scanner); //удалить задачу
                            break;
                        case 3:
                            getTasksForDay(scanner); // получить задачи на определённый день
                            break;
                        case 4:
                            printAllTasks(); // получить все задачи
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.print("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void inputTask(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Введите название задачи: ");
        String heading = scanner.nextLine();
        System.out.print("Введите описание задачи: ");
        String description = scanner.nextLine();
        System.out.print("Выберите тип задачи: рабочая - '0', личная - '1': ");
        TaskType taskType;
        label:
        while (true) {
            if (scanner.hasNextInt()) {
                int type = scanner.nextInt();
                switch (type) {
                    case 0:
                        taskType = TaskType.WORK;
                        break label;
                    case 1:
                        taskType = TaskType.PRIVATE;
                        break label;
                    default:
                        System.out.print("Введите 0 или 1: ");
                }
            } else {
                System.out.print("Введите 0 или 1: ");
                scanner.next();
            }
        }
        scanner.nextLine();
        System.out.print("Введите дату и время в формате: \"HH mm dd MM yyyy\": ");
        LocalDateTime timeOfCreation;
        while (true) {
            try {
                timeOfCreation = LocalDateTime.parse(scanner.nextLine(), Task.DATE_TIME_FORMATTER);
                break;
            } catch (DateTimeParseException e) {
                System.out.print("Время или дата указаны не в том формате. Введите в верном формате.");
            }
        }
        System.out.print("Выберите повторяемость задачи: 1 - однократная; 2 - ежедневная; 3 - еженедельная; " +
                "4 - ежемесячная; 5 - ежегодная: ");
        Task task;
        label:
        while (true) {
            if (scanner.hasNextInt()) {
                int type = scanner.nextInt();
                switch (type) {
                    case 1:
                        task = new OneTimeTask(heading, description, taskType, timeOfCreation);
                        break label;
                    case 2:
                        task = new DailyTask(heading, description, taskType, timeOfCreation);
                        break label;
                    case 3:
                        task = new WeeklyTask(heading, description, taskType, timeOfCreation);
                        break label;
                    case 4:
                        task = new MonthlyTask(heading, description, taskType, timeOfCreation);
                        break label;
                    case 5:
                        task = new YearlyTask(heading, description, taskType, timeOfCreation);
                        break label;
                    default:
                        System.out.println("Введите: 1 - однократная; 2 - ежедневная; 3 - еженедельная;" +
                                "4 - ежемесячная; 5 - ежегодная: ");
                }
            } else {
                System.out.println("Введите: 1 - однократная; 2 - ежедневная; 3 - еженедельная;" +
                        "4 - ежемесячная; 5 - ежегодная: ");
                scanner.next();
            }
        }
        calendar.addTask(task);
    }

    private static void deleteTask(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Введите id задачи для удаления: ");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Введите id в цифровом формате.");
                scanner.nextLine();
            } else {
                int numForDel = scanner.nextInt();
                if (calendar.removeTask(numForDel)) {
                    System.out.println("Задача с id " + numForDel + " удалена.");
                } else {
                    System.out.println("Задачи с таким номером id в данном списке не найдено. ");
                }
                break;
            }
        }
    }

    public static void getTasksForDay(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Введите дату для просмотра задач в формате \"dd MM yy\": ");
        LocalDate date = null;
        boolean shouldEnterAgain = true;
        while (shouldEnterAgain) {
            try {
                date = LocalDate.parse(scanner.nextLine(), Task.DATE_FORMATTER);
                shouldEnterAgain = false;
            } catch (DateTimeParseException e) {
                System.out.print("Введите дату в формате \"dd MM yy\": ");
            }
        }
        System.out.println(calendar.getTasksForOneDay(date));
    }

    private static void printMenu() {
        System.out.println("1. Добавить; 2. Удалить; 3. Получить на указанный день; 4. Все задачи; 0. Выход");
    }

    private static void printAllTasks() {
        System.out.println(calendar);
    }

}


