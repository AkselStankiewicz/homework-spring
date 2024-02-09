package sda.springbasic.homeworkspring.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sda.springbasic.homeworkspring.exceptions.ClientAlreadyExistsException;
import sda.springbasic.homeworkspring.exceptions.NoSuchClientInDatabase;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ClientAlreadyExistsException.class)
    public ResponseEntity<String> handleExistingClientException(ClientAlreadyExistsException exception) {
        return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(exception.getMessage());
    }
    @ExceptionHandler(NoSuchClientInDatabase.class)
    public ResponseEntity<String> handleExistingClientException(NoSuchClientInDatabase exception) {
        return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(exception.getMessage());
    }

}
