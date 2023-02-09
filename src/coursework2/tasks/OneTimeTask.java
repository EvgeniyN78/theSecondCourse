package coursework2.tasks;

import coursework2.Task;
import coursework2.TaskType;
import validation.WrongInputException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String heading, String description, TaskType taskType,
                       LocalDateTime timeOfCreation) throws WrongInputException {
        super(heading, description, taskType, timeOfCreation);
    }
}
