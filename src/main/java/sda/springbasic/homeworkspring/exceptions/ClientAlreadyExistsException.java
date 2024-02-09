package sda.springbasic.homeworkspring.exceptions;

public class ClientAlreadyExistsException extends RuntimeException{
    public ClientAlreadyExistsException() {
        super("Podany użytkownik już istnieje.");
    }
}
