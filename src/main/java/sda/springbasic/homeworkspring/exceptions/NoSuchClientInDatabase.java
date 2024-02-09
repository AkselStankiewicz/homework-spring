package sda.springbasic.homeworkspring.exceptions;

public class NoSuchClientInDatabase extends RuntimeException{
    public NoSuchClientInDatabase() {
        super("Brak podanego użytkownika w bazie.");
    }
}
